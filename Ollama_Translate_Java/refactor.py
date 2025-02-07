import re
import os
from langchain_ollama import OllamaLLM

def extract_function_from_file(file_path):
    with open(file_path, 'r') as file:
        function = file.read()
    return function

#extract code
def extract_code(input_str):
    # Regular expression to capture content inside the '```java` and '```' markers
    match = re.search(r'Java Class:\n```java(.*?)```', input_str, re.DOTALL)
    match2 = re.search(r'Java Class:\n\n```java(.*?)```', input_str, re.DOTALL)
    match3 = re.search(r'   Java Class:\n   \n```java(.*?)```',  input_str, re.DOTALL)
    if match:
        code = match.group(1).strip()
        return code
    elif match2:
        code = match2.group(1).strip()
        return code
    elif match3:
        code = match3.group(1).strip()
        return code
    else:
        return ""


#extract test 
def extract_test(input_str):
    match = re.search(r'Unit Test:\n```java(.*?)```', input_str, re.DOTALL)
    match2 = re.search(r'Unit Test:\n\n```java(.*?)```', input_str, re.DOTALL)
    match3 = re.search(r'   Unit Test:\n   \n```java(.*?)```',  input_str, re.DOTALL)
    if match:
        code = match.group(1).strip()
        return code
    elif match2:
        code = match2.group(1).strip()
        return code
    elif match3:
        code = match3.group(1).strip()
        return code
    return ""

llm = OllamaLLM(model='llama3.2')
query = 'add prompt here'

for i in range(90,164):
    num = i
    class_path = f'Test_Coverage_Java/src/main/java/HumanEval_{num}.java'
    #path = 'Test_Coverage_Java\src\main\java\HumanEval_6.java'
    class_code = extract_function_from_file(class_path)

    test_path = f'Test_Coverage_Java/src/test/java/test_HumanEval_{num}.java'
    test_code = extract_function_from_file(test_path)


    prompt = f"""
    Given a Java class and corresponding unit test, Refactor the unit test and Java class so that it is compiliable and free of errors. 
    Requirements: 
    - Use JUnit5 annotations (@test) for the unit test
    - Do not rename the Java class
    - Do not include tested function in the test file
    - Create proper test class with instances of the java function that is being tested
    - Do not change any of the test values

    Here is the Java class:
    {class_code}


    Here is the unit test:
    {test_code}

    Return the corrected code as two seperate blocks of code in the following format:
    Java Class:
    ```java 
        
    ```

    Unit Test:
    ```java
        
    ```

    """

    query = prompt
    response = llm.invoke(query)
    #print(response)

    # set up Java project directories beforehand

    code_output_path = os.path.join("Refactor_Java", "src", "main", "java", f"HumanEval_{num}.java")
    if(extract_code(response) != ""):
        with open(code_output_path, 'w', encoding="utf-8") as file:
            file.write(extract_code(response))
    else:
        print(f'Error: HumanEval_{num} not found')

    test_output_path = os.path.join("Refactor_Java", "src", "test", "java", f"HumanEval_{num}Test.java")
    if(extract_test(response) != ""):
        with open(test_output_path, 'w', encoding="utf-8") as file:
            file.write(extract_test(response))
    else:
        print(f'Error: HumanEval_{num} test not found')

    #Save copy of response
    copy_output_path = os.path.join("Ollama_Translate_Java", "refactor", f"HumanEval_{num}.txt")
    with open(copy_output_path, 'w', encoding = 'utf-8') as file:
        file.write(response)
    
    print(f'{num} / 163')