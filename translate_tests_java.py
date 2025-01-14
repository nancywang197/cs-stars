from langchain_community.llms import Ollama
#LangChainDeprecationWarning: The class `Ollama` was deprecated in LangChain 0.3.1 and will be removed in 1.0.0. 
#An updated version of the class exists in the :class:`~langchain-ollama package and should be used instead. 
# To use it run `pip install -U :class:`~langchain-ollama` and import as `from :class:`~langchain_ollama import OllamaLLM``.

def extract_function_from_file(file_path):
    with open(file_path, 'r') as file:
        function = file.read()
    return function

# Initialize Ollama with chosen model
llm = Ollama(model="llama3.2")

# 1. Extract Python function
# tests >> test_HumanEval_1.py
num = 3
file_path = f'Test_Coverage/processed_dataset/tests/test_HumanEval_{num}.py'
test = extract_function_from_file(file_path)
example_py = extract_function_from_file('example.py')
example_java = extract_function_from_file('example.java')

# 2. Query
# option 1: contains an example
# query1 = f"Translate this Python function to Java:\n{function}\nHere is an example of a python function:\n{example_py}\n\nHere is the expected output in Java:\n{example_java}"

# option 2: does not contain an example
query2 = f"Translate this Python test to Java:\n{test}" 

# 3. Invoke the model with a query
response = llm.invoke(query2)
#print(response)

# 4. Write to file
file_name = f'HumanEval{num}_q2.txt'
with open(file_name, 'w') as file:
    file.write(response)