from langchain_ollama import OllamaLLM
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

for i in range(164): 
    # 1. Extract Python function
    num = i
    file_path = f'Test_Coverage/processed_dataset/functions/HumanEval_{num}.py'
    function = extract_function_from_file(file_path)
    class_name = f'HumanEval{num}'
    
    # 2. Query
    query = f'''Translate this Python function to Java:
    {function} 

    Requirements:
    - Ensure the class name is {class_name}
    - Add all necessary imports
    - Do not generate additional code 
    - Do not change the function signatures
    - The output should be Java code only
    - Make all methods public

    '''
    #include in context example
    #type mapping (alphatrans) 
    # feedback (Yang - flakeydoctor)

    # 3. Invoke the model with a query
    response = llm.invoke(query)
    #print(response)

    # 4. Process Response
    input = extract_code(response)
    func = remove_main_method(input)

    # 5. Write to file
    folder_path = os.path.join("Test_Coverage_Java2", "src", "main", "java", f'HumanEval{num}.java')
    with open(folder_path, 'w', encoding="utf-8") as file:
        file.write(func)

    copy_path = os.path.join("Ollama_Translate_Java", "regenerate", f'HumanEval{num}.txt')
    with open(copy_path, 'w', encoding="utf-8") as file:
        file.write(response)
    
    print(f'completed {num}/163')
