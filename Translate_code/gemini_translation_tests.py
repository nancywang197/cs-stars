
import google.generativeai as genai
import config
import os
import time

def read_python_file(file_path):
    #Read content from a Python file.
    with open(file_path, "r") as file:
        return file.read()

def create_translation_prompt(python_code, java_function):
    # Create the prompt for translation.
    return f"""
    Translate this Python test to Java using JUnit 4. 
    Here's the Java function being tested:

    {java_function}

    Requirements:
    - Use JUnit 4 annotations (@Test)
    - Do not add comments 
    - Add necessary imports
    - The file should be a valid java file that can test the function
    - Create proper test class with instances of the java function that is being tested
    - Convert Python assertions to JUnit assertions
    - Don't include the tested function in the test file
    
    Python test to translate:
    {python_code}

    """
    
def filter_java_content(file_path):
    #Filter Java content to remove unnecessary parts.
    with open(file_path, "r") as file:
        lines = file.readlines()

    start_index = next((i for i, line in enumerate(lines) 
                       if 'import' in line or '{' in line), None)
    end_index = len(lines) - next((i for i, line in enumerate(reversed(lines)) 
                                  if '}' in line), 0)

    filtered_content = lines[start_index:end_index] if start_index is not None else lines

    with open(file_path, "w") as file:
        file.writelines(filtered_content)

def process_single_file(input_file, function_file, output_directory, model):
       #Process a single HumanEval file.

        # Read Python code
        python_code = read_python_file(input_file)
        java_function = read_python_file(function_file)
        
        # Generate translation prompt and get response
        prompt = create_translation_prompt(python_code, java_function)
        response = model.generate_content(prompt)
        
        # Create output file path and write translated content
        base_name = os.path.basename(input_file)
        output_name = "HumanEval_" + os.path.splitext(base_name.split('_')[-1])[0] + "Test.java"


        output_file_path = os.path.join(output_directory, output_name)
        
        with open(output_file_path, "w") as output_file:
            output_file.write(response.text)

        print("written")
        
        # Filter the Java content
        filter_java_content(output_file_path)
        
        

def main():
    # Setup
    output_directory = r"Translate_code/translated_data/tests"
    os.makedirs(output_directory, exist_ok=True)
    genai.configure(api_key=config.API_KEY)
    model = genai.GenerativeModel("gemini-1.5-flash")
    

    # batch_size = 15
    # total_files = 163

    # for start in range(19, total_files, batch_size):
    #     end = min(start + batch_size, total_files)
    for i in range(156,164):
        input_file = f"Test_Coverage/processed_dataset/tests/test_HumanEval_{i}.py"
        function_file = f"Translate_code/translated_data/functions/HumanEval_{i}.java"
        process_single_file(input_file, function_file, output_directory, model)        
        # print(f"Processed files {start} to {end-1}. Waiting for 20 seconds...")
        # time.sleep(20)

if __name__ == "__main__":
    main()