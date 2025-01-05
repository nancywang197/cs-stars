from functions.HumanEval_134 import check_if_last_char_is_a_letter

def test_HumanEval_134():
  assert check_if_last_char_is_a_letter("") == False
  assert check_if_last_char_is_a_letter("eeeee e ") == False
  assert check_if_last_char_is_a_letter("apple pie") == False
  assert check_if_last_char_is_a_letter("apple pi e ") == False
  
  # Check some edge cases that are easy to work out by hand.
  assert True
  
