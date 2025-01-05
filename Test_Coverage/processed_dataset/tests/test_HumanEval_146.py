from functions.HumanEval_146 import specialFilter

def test_HumanEval_146():
  
  # Check some edge cases that are easy to work out by hand.
  assert specialFilter([1]) == 0
  assert specialFilter([]) == 0
  
