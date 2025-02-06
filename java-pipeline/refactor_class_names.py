import os

# Path to the directory where the files are located
folder_path = 'Test_Coverage_Java/src/main/java'

# Function to replace 'public class Main' with 'public class [filename]'
def replace_class_name_in_file(file_path, filename):
    with open(file_path, 'r') as file:
        content = file.read()

    # Replace 'public class Main' with 'public class [filename]'
    updated_content = content.replace('public class Main', f'public class {filename}')

    with open(file_path, 'w') as file:
        file.write(updated_content)

# Iterate through all files in the folder
for filename in os.listdir(folder_path):
    file_path = os.path.join(folder_path, filename)

    # Process only Java files
    if filename.endswith('.java'):
        # Remove the extension from the filename (to get the class name)
        class_name = os.path.splitext(filename)[0]

        replace_class_name_in_file(file_path, class_name)

print("Replacement complete!")
