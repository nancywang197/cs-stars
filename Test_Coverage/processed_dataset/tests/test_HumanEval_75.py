from functions.HumanEval_75 import is_multiply_prime

def test_HumanEval_75():
  assert is_multiply_prime(9 * 9 * 9) == False
  assert is_multiply_prime(11 * 9 * 9) == False
  assert is_multiply_prime(11 * 13 * 7) == True
  
