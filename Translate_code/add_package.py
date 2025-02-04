import os
import re

#script to make the functions and test run on android studio
#import original function
#add package name
#make class public

# Define paths
source_folder = "translated_data/tests"
destination_folder = "tests_copy"

# Create the destination folder if it doesn't exist
os.makedirs(destination_folder, exist_ok=True)
i = 0

# Process each Java file
for filename in os.listdir(source_folder):
    if filename.endswith(".java"):  # Only process Java files
        source_path = os.path.join(source_folder, filename)
        capitalized_filename = filename[0].upper() + filename[1:] if filename[0].islower() else filename
        destination_path = os.path.join(destination_folder, capitalized_filename)

        # Read the content of the source file
        with open(source_path, "r") as source_file:
            content = source_file.readlines()

        
        match = re.search(r"(?:human|Human)Eval_(\d{1,3})Test\.java", filename, re.IGNORECASE)
        if match:
            file_number = match.group(1)  # Extract the number as a string

            # Read the content of the source file
            with open(source_path, "r") as source_file:
                content = source_file.readlines()

            # Lines to prepend
            prepend_line = (
                f"package com.example.python_to_java.tests_copy;\n"
                f"import com.example.python_to_java.functions_copy.HumanEval_{file_number};\n"
            )

            # Prepend the line and write to the new file
            with open(destination_path, "w") as destination_file:
                destination_file.write(prepend_line)
                destination_file.writelines(content)

print(f"Updated files have been saved in the '{destination_folder}' folder.")
