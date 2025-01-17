from langchain_community.llms import Ollama
#LangChainDeprecationWarning: The class `Ollama` was deprecated in LangChain 0.3.1 and will be removed in 1.0.0. 
#An updated version of the class exists in the :class:`~langchain-ollama package and should be used instead. 
# To use it run `pip install -U :class:`~langchain-ollama` and import as `from :class:`~langchain_ollama import OllamaLLM``.
import re
import os

def extract_function_from_file(file_path):
    with open(file_path, 'r') as file:
        function = file.read()
    return function

def extract_code(input_str):
    # Regular expression to capture content inside the '```java` and '```' markers
    match = re.search(r'```java(.*?)```', input_str, re.DOTALL)
    if match:
        # Extract the code and remove the `main` method and its body
        code = match.group(1).strip()

        # Regular expression to remove the `main` method
        code = re.sub(r'public static void main\(String\[\] args\) \{.*?\}', '', code, flags=re.DOTALL)
        
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
llm = Ollama(model="llama3.2")

for i in range(2,164): 
    # 1. Extract Python function
    num = i
    file_path = f'Test_Coverage/processed_dataset/functions/HumanEval_{num}.py'
    function = extract_function_from_file(file_path)
    
    # 2. Query
    query = f"Translate this Python function to Java:\n{function}" 

    # 3. Invoke the model with a query
    response = llm.invoke(query)
    #print(response)

    # 4. Process Response
    input = extract_code(response)
    func = remove_main_method(input)

    # 5. Write to file
    folder_path = os.path.join("Test_Coverage_Java", "src", "main", "java", f'HumanEval_{num}.java')
    with open(folder_path, 'w', encoding="utf-8") as file:
        file.write(func)

    copy_path = os.path.join("Translate_Java", "functions", f'HumanEval_{num}.txt')
    with open(copy_path, 'w', encoding="utf-8") as file:
        file.write(response)
    
    print(f'completed {num}/163')
