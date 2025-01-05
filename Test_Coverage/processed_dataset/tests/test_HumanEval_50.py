from functions.HumanEval_50 import decode_shift

def test_HumanEval_50():
  
  letters = string.ascii_lowercase
  for _ in range(100):
  str = ''.join(choice(letters) for i in range(randint(10, 20)))
  encoded_str = encode_shift(str)
  assert decode_shift(copy.deepcopy(encoded_str)) == str
  
