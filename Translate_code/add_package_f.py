import os
import re

#script to make the functions and test run on android studio
#import original function
#add package name
#make class public

# Define paths
source_folder = "translated_data/functions"
destination_folder = "functions_copy"

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

        
        match = re.search(r"(?:human|Human)Eval_(\d{1,3})\.java", filename, re.IGNORECASE)
        if match:
            file_number = match.group(1)  # Extract the number as a string

            # Read the content of the source file
            with open(source_path, "r") as source_file:
                content = source_file.readlines()

            # Lines to prepend
            prepend_line = (
                f"package com.example.python_to_java.functions_copy;\n"
            )

            additional_imports = []
            file_content_str = "".join(content).lower()

            if "list" in file_content_str.lower() and "import java.util.List;".lower() not in file_content_str.lower():
                additional_imports.append("import java.util.List;\nimport java.util.ArrayList;\n")

            if "set" in file_content_str.lower() and "import java.util.Set;".lower() not in file_content_str.lower():
                additional_imports.append("import java.util.Set;\nimport java.util.HashSet;\n")

            if "map" in file_content_str.lower() and "import java.util.Map;".lower() not in file_content_str.lower():
                additional_imports.append("import java.util.Map;\nimport java.util.HashMap;\n")

            # Combine all import lines
            prepend_line += "".join(additional_imports)

            modified_content = []
            for line in content:
                # Look for class declaration
                if re.match(r'^\s*class\s+', line):
                    # Add public modifier if not already present
                    if 'public' not in line:
                        line = re.sub(r'(^\s*)(class\s+)', r'\1public \2', line)
                modified_content.append(line)

            # Write to the new file
            with open(destination_path, "w") as destination_file:
                destination_file.write(prepend_line)
                destination_file.writelines(modified_content)

        

print(f"Updated files have been saved in the '{destination_folder}' folder.")
