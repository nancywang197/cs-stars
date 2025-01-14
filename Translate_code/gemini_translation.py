import google.generativeai as genai
import config
import os

# Configure the API with the key from config.py
genai.configure(api_key=config.API_KEY)
model = genai.GenerativeModel("gemini-1.5-flash")

file_path = "Test_Coverage/processed_dataset/functions/HumanEval_0.py"

with open(file_path, "r") as file:
    python_code = file.read()

# Create the prompt to ask the model to translate from Python to Java
prompt = f"""
Give the raw java implemetation for the following python code. The output should be valid java code ONLY. DO NOT include any extras like class declation, comments, markers, or extra functions.

Python code:
{python_code}

"""
# Generate the translated content
response = model.generate_content(prompt)

# Write the translated Java code
output_directory = r"Translate_code/translated_data/functions"
os.makedirs(output_directory, exist_ok=True)

# Path for the new Java file
output_file_path = os.path.join(output_directory, "HumanEval_0.java")

# Write the translated Java code into the new file
with open(output_file_path, "w") as output_file:
    output_file.write(response.text)

# Function to filter content
def filter_java_content(file_path):
    with open(file_path, "r") as file:
        lines = file.readlines()

    # Find the first line with `import` or `{`
    start_index = next((i for i, line in enumerate(lines) if 'import' in line or '{' in line), None)
    
    # Find the last line with `}`
    end_index = len(lines) - next((i for i, line in enumerate(reversed(lines)) if '}' in line), 0)

    # Extract the relevant content
    filtered_content = lines[start_index:end_index] if start_index is not None else lines

    # Write the filtered content back to the file
    with open(file_path, "w") as file:
        file.writelines(filtered_content)

# Filter the Java content
filter_java_content(output_file_path)
