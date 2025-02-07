import json
fp = 'java-pipeline/Type_Inference/universal_type_map_final.json'
types = {}
with open(fp, "r") as f:
    types = json.load(f)
print(types)

python_to_java = {value: key for key, value in types.items()}
print(python_to_java)

# Write JSON to a file
with open("python_to_java_type_mapping.json", "w") as json_file:
    json.dump(python_to_java, json_file, indent=4)