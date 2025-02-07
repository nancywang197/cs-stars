import re
import os
from langchain_ollama import OllamaLLM

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


llm = OllamaLLM(model='llama3.2')

#1st iteration
class_path = 'Test_Coverage_Java2\src\main\java\HumanEval7.java'
java_class = extract_function_from_file(class_path)

#1st iteration
test_path = 'Test_Coverage_Java2/src/test/java/HumanEval7Test.java'
java_test = extract_function_from_file(test_path)

#1st iteration
#error_message = '[ERROR] HumanEval6.java:[23,33] method parseNestedParens(java.lang.String) is already defined in class HumanEval6'

error_message = ""


prompt = f''' Given this class: 
{java_class}

And given this test:
{java_test}

Refactor the Java test and class so that it compiles. 

Here is the error message given when compiling the current test:
{error_message}

Requirements:
- Return the refactored Java code only
- Ensure types match in class and test
- Do not change the class names
- Include JUnit5 annotations and necessary imports
- Do not include tested function in the test file
- Create proper test class, declaring and using an instance of the Java class that is being tested

'''

response = llm.invoke(prompt)

output_path = 'Ollama_Translate_Java\HumanEval7Iter1.txt'
if(extract_code(response) != ""):
    with open(output_path, 'w', encoding="utf-8") as file:
        file.write(extract_code(response))
else:
    print(f'Error: response not found')

print(response)