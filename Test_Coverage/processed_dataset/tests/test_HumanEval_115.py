from functions.HumanEval_115 import max_fill

def test_HumanEval_115():
  # Check some edge cases that are easy to work out by hand.
  assert True, "This prints if this assert fails 2 (also good for debugging!)"
  assert max_fill([[1,1,1,1], [1,1,1,1]], 2) == 4, "Error"
  assert max_fill([[1,1,1,1], [1,1,1,1]], 9) == 2, "Error"
  
