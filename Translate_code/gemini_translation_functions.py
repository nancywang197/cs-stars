import google.generativeai as genai
import config
import os
import time

def read_python_file(file_path):
    #Read content from a Python file.
    with open(file_path, "r") as file:
        return file.read()

def create_translation_prompt(python_code):
    # Create the prompt for translation.
    return f"""
    Give the raw java implemetation for the following python code. The output should be valid java code ONLY. DO NOT include any extra functions. Do not change the function signatures.
    Python test:
    {python_code}
    """
    
def filter_java_content(file_path,i):
    #Filter Java content to remove unnecessary parts.
    with open(file_path, "r") as file:
        lines = file.readlines()

    start_index = next((i for i, line in enumerate(lines) 
                       if 'import' in line or '{' in line), None)
    end_index = len(lines) - next((i for i, line in enumerate(reversed(lines)) 
                                  if '}' in line), 0)

    filtered_content = lines[start_index:end_index] if start_index is not None else lines

    for idx, line in enumerate(filtered_content):
        if 'class ' in line:
            filtered_content[idx] = f'class HumanEval_{i} {{\n'
            break


    with open(file_path, "w") as file:
        file.writelines(filtered_content)

def process_single_file(input_file, output_directory, model,i):
       #Process a single HumanEval file.

        # Read Python code
        python_code = read_python_file(input_file)
        
        # Generate translation prompt and get response
        prompt = create_translation_prompt(python_code)
        response = model.generate_content(prompt)
        
        # Create output file path and write translated content
        base_name = os.path.basename(input_file)
        output_name = os.path.splitext(base_name)[0] + ".java"
        output_file_path = os.path.join(output_directory, output_name)
        
        with open(output_file_path, "w") as output_file:
            output_file.write(response.text)

        filter_java_content(output_file_path,i)
        
        

def main():
    # Setup
    output_directory = r"Translate_code/translated_data/functions"
    os.makedirs(output_directory, exist_ok=True)
    genai.configure(api_key=config.API_KEY)
    model = genai.GenerativeModel("gemini-1.5-flash")

    for i in range(0, 1):
        input_file = f"Test_Coverage/processed_dataset/functions/HumanEval_{i}.py"
        process_single_file(input_file, output_directory, model,i)        

if __name__ == "__main__":
    main()