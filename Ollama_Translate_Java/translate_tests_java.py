import re
import os
from langchain_ollama import OllamaLLM
#LangChainDeprecationWarning: The class `Ollama` was deprecated in LangChain 0.3.1 and will be removed in 1.0.0. 
#An updated version of the class exists in the :class:`~langchain-ollama package and should be used instead. 
# To use it run `pip install -U :class:`~langchain-ollama` and import as `from :class:`~langchain_ollama import OllamaLLM``.

def extract_function_from_file(file_path):
    with open(file_path, 'r') as file:
        function = file.read()
    return function

def extract_code(input_str):
    # Regular expression to capture content inside the '```java` and '```' markers
    match = re.search(r'```java(.*?)```', input_str, re.DOTALL)
    if match:
        code = match.group(1).strip()
        return code.strip()
    return ""

def remove_main_method(code):
    start_index = code.find('public static void main(String[] args) {')
    if start_index == -1:
        return code  # Return the original code if `main` is not found

    # Find the opening curly brace after `main` method
    open_brace_count = 1  # We have already encountered one opening brace
    i = start_index + len('public static void main(String[] args) {')
    while i < len(code) and open_brace_count > 0:
        if code[i] == '{':
            open_brace_count += 1
        elif code[i] == '}':
            open_brace_count -= 1
        i += 1

    # Remove the `main` method including the braces
    return code[:start_index] + code[i:]

# Initialize Ollama with chosen model
llm = OllamaLLM(model="llama3.2")

for i in range(4,8):
    # 1. Extract Python function
    # tests >> test_HumanEval_1.py
    num = i
    file_path = f'Test_Coverage/processed_dataset/tests/test_HumanEval_{num}.py'
    test = extract_function_from_file(file_path)
    class_name = f'HumanEval{num}Test'
    function_path = f'Test_Coverage_Java2/src/main/java/HumanEval{num}.java'
    function = extract_function_from_file(function_path)


    # 2. Query
    query = f'''Given this Java class: 
    {function}
    
    Translate this Python test to Java using JUnit5:
    {test}

    Requirements:
    - Include JUnit5 annotations (@test)
    - Do not include tested function in the test file
    - Create proper test class, declaring and using an instance of the Java class that is being tested
    - Do not change any of the test values
    - Ensure the class name is {class_name}
    - Ensure that types are compatible with included Java class

    '''
    # changes made: include translated test so model has better idea of typing
    # specify JUnit5

    # 3. Invoke the model with a query
    response = llm.invoke(query)
    #print(response)

    # 4. Process Response
    input = extract_code(response)
    t = remove_main_method(input)

    # 5. Write to file
    folder_path = os.path.join("Test_Coverage_Java2", "src", "test", "java", f'HumanEval{num}Test.java')
    with open(folder_path, 'w', encoding="utf-8") as file:
        file.write(t)
    
    copy_path = os.path.join("Ollama_Translate_Java", "regenerate", f'HumanEval{num}Test.txt')
    with open(copy_path, 'w', encoding="utf-8") as file:
        file.write(response)

    print(f'completed {num}/163')