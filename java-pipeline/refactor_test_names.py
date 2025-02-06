import os

def replace_test_class_name(file_path, filename):
    #1 get number
    #2 if(public class HumanEval{num}Test), then replace with public class HumanEval_{num}Test
    with open(file_path, 'r') as file:
        content = file.read()
    
    updated_content = content.replace('public class HumanEval_{num}Test', f'public class {filename}')

    with open(file_path, 'w') as file:
        file.write(updated_content)