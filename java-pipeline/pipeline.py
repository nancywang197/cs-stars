import tree_sitter_python as tspython
from tree_sitter import Language, Parser

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

def extract_types(code):
    # Parse the Python code into a syntax tree
    tree = parser.parse(bytes(code, 'utf8'))
    root_node = tree.root_node

    print_ast(root_node,0)

    # Function to walk through the syntax tree and extract type information
    def walk(node):
        result = []

        # Check for variable assignments (assignments with type annotations)
        if node.type == "assignment":
            for child in node.children:
                if child.type == "identifier":
                    var_name = code[child.start_byte:child.end_byte]
                    result.append({"var_name": var_name, "line": child.start_point[0] + 1})

                if child.type == "annotation":
                    annotation = code[child.start_byte:child.end_byte]
                    result.append({"var_name": var_name, "type_annotation": annotation, "line": child.start_point[0] + 1})

        # Handle function definitions
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

                # Check for parameters and their types
                if child.type == "parameters":
                    for param in child.children:
                        if param.type == "parameters":
                            param_info = {"param_name": None, "param_type": None}
                            for sub_child in param.children:
                                if sub_child.type == "identifier":
                                    param_info["param_name"] = code[sub_child.start_byte:sub_child.end_byte]
                                elif sub_child.type == "typed_parameter":
                                    param_info["param_type"] = code[sub_child.start_byte:sub_child.end_byte]
                            func_info["parameters"].append(param_info)
                
                # Check for return type annotation
                if child.type == "return_type":
                    func_info["return_type"] = code[child.start_byte:child.end_byte]

            result.append(func_info)

        # Recurse through all children
        for child in node.children:
            result.extend(walk(child))

        return result

    # Start walking from the root node
    return walk(root_node)



# Python code path and function
num = 0
file_path = f'Test_Coverage/processed_dataset/functions/HumanEval_{num}.py'
python_code = extract_function_from_file(file_path)

# Extract type information
type_info = extract_types(python_code)

# Display the extracted information
for info in type_info:
    print(info)



# Generate translation and corresponding test

# - prompt
# - in context example
# - reccommended type conversions
# Requirements


# Test in maven


# If pass -> continue
# Else -> use error feedback + reprompt
# After x retries: note as failed to translate