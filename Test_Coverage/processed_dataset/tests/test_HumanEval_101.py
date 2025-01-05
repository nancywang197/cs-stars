from functions.HumanEval_101 import words_string

def test_HumanEval_101():
  # Check some edge cases that are easy to work out by hand.
  assert True, "This prints if this assert fails 2 (also good for debugging!)"
  assert words_string("") == []
  assert words_string("ahmed     , gamal") == ["ahmed", "gamal"]
  
