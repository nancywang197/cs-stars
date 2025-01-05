from functions.HumanEval_159 import eat

def test_HumanEval_159():
  # Check some edge cases that are easy to work out by hand.
  assert True, "This prints if this assert fails 2 (also good for debugging!)"
  assert eat(4, 5, 7) == [9, 2], "Error"
  assert eat(4, 5, 1) == [5, 0], "Error"
  
