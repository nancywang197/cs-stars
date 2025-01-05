from functions.HumanEval_48 import is_palindrome

def test_HumanEval_48():
  assert is_palindrome('zbcd') == False
  assert is_palindrome('xywyx') == True
  assert is_palindrome('xywyz') == False
  assert is_palindrome('xywzx') == False
  
