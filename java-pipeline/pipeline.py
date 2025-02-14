import tree_sitter_python as tspython
from tree_sitter import Language, Parser
import re
import json

# Helper functions
def extract_function_from_file(file_path):
    with open(file_path, 'r') as file:
        function = file.read()
    return function

# Use Treesitter to get type information
# initialize the Tree-sitter parser for Python
PY_LANGUAGE = Language(tspython.language())
parser = Parser(PY_LANGUAGE)

def print_ast(node, indent=0):
    # Print the node type and its range
    print("  " * indent + f"{node.type} ({node.start_byte}-{node.end_byte})")
    
    # Recursively print all child nodes
    for child in node.children:
        print_ast(child, indent + 1)


# Use Treesitter to get type information
# initialize the Tree-sitter parser for Python
PY_LANGUAGE = Language(tspython.language())
parser = Parser(PY_LANGUAGE)

def print_ast(node, indent=0):
    # Print the node type and its range
    print("  " * indent + f"{node.type} ({node.start_byte}-{node.end_byte})")
    
    # Recursively print all child nodes
    for child in node.children:
        print_ast(child, indent + 1)

def extract_types(code):
    # Parse the Python code into a syntax tree
    tree = parser.parse(bytes(code, 'utf8'))
    root_node = tree.root_node

    # Function to walk through the syntax tree and extract type information
    def walk(node):
        result = []
        #Check for imports
        if node.type in ("import_statement", "import_from_statement"):
            module_info = {"modules": []}
            module = {"module": None, "name": None}
            read_import = False
            for child in node.children:
                if child.type == 'dotted_name':
                    for sub_child in child.children:
                        if sub_child.type == "identifier":
                            if read_import:
                                module["name"] = code[sub_child.start_byte:sub_child.end_byte]
                            else:
                                module["module"] = code[sub_child.start_byte:sub_child.end_byte]
                elif child.type == "import":
                    read_import = True
            module_info["modules"].append(module)
            result.append(module_info)

        # Extract variable assignments
        # TODO: fix data structuring
        if node.type == "assignment":
            var_info = {
                "var_name" : None,
                "var_type" : None,
                "line" : node.start_point[0] + 1
            }
            past_eq = False
            for child in node.children:
                #print(child)
                if child.type == "identifier":
                    var_name = code[child.start_byte:child.end_byte]
                    var_info["var_name"] = var_name
                elif child.type == "=":
                    past_eq = True
                elif past_eq:
                    var_info["var_type"] = child.type
            result.append(var_info)

        # Extract function defintion / parameters
        elif node.type == "function_definition":
            func_info = {
                "function_name": None, 
                "parameters": [], 
                "return_type": None, 
                "line": node.start_point[0] + 1
            }
            # Extract function name
            for child in node.children:
                if child.type == "identifier":
                    func_info["function_name"] = code[child.start_byte:child.end_byte]

                # Check for parameters annotation
                if child.type == "parameters":
                    for param in child.children:
                        if param.type == "typed_parameter":
                            param_info = {"param_name": None, "param_type":None}
                            for sub_child in param.children:
                                #print(sub_child)
                                if sub_child.type == "identifier":
                                    #print(f'identifier: {code[sub_child.start_byte:sub_child.end_byte]}')
                                    param_info["param_name"] = code[sub_child.start_byte:sub_child.end_byte]
                                elif sub_child.type == "type":
                                    #print(f'type: {code[sub_child.start_byte:sub_child.end_byte]}')
                                    param_info["param_type"] = code[sub_child.start_byte:sub_child.end_byte]

                            func_info["parameters"].append(param_info)

                # Check for return type annotation
                if child.type == "type":
                    #print(f'type: {code[child.start_byte:child.end_byte]}')
                    func_info["return_type"] = code[child.start_byte:child.end_byte]

            result.append(func_info)

        # Recurse through all children
        for child in node.children:
            result.extend(walk(child))

        return result

    # Start walking from the root node
    return walk(root_node)

fp = 'java-pipeline/python_to_java_type_mapping.json'
python_to_java = {}
with open(fp, "r") as f:
    python_to_java = json.load(f)

# Type Inference
def refactor_module(module_name, imported_name, type_str): 
        # Regex pattern to match `imported_name` only when it's standalone or followed by `[`
    pattern = rf'\b{re.escape(imported_name)}(?=\[)'

    # Replacement string
    replacement = f"{module_name}.{imported_name}"

    # Perform the substitution
    refactored_type = re.sub(pattern, replacement, type_str)

    return refactored_type


def translate_types(data: list[dict]):
    inputs = data[:]
    translations = []
    modules = []
    for input in inputs:
        if "modules" in input:
            modules = input["modules"]
            print("Processed Modules")
        elif "parameters" in input:
            parameters = input["parameters"]
            for i in range(len(parameters)):
                param_translation = {'param_name': parameters[i]['param_name'], "param_type": None}
                python_type = parameters[i]["param_type"]
                java_type = 'No type found'
                if python_type in python_to_java:
                    java_type = python_to_java[python_type]
                else :
                    for pair in modules:
                        module_name = pair["module"]
                        imported_name = pair["name"]
                        refactored_type = refactor_module(module_name, imported_name, python_type)
                        if refactored_type in python_to_java:
                            java_type = python_to_java[refactored_type]
                param_translation["param_type"] = java_type
                translations.append(param_translation)

        elif "var_name" in input:
            print("Process variables")
        
    return translations
    

# Generate translation and corresponding test

# - prompt
# - in context example
# - reccommended type conversions
# Requirements


# Test in maven


# If pass -> continue
# Else -> use error feedback + reprompt
# After x retries: note as failed to translate