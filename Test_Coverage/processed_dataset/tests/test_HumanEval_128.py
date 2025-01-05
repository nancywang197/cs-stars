from functions.HumanEval_128 import prod_signs

def test_HumanEval_128():
  assert prod_signs([-1, 1, -1, 1]) == 4
  assert prod_signs([-1, 1, 1, 1]) == -4
  assert prod_signs([-1, 1, 1, 0]) == 0
  
  # Check some edge cases that are easy to work out by hand.
  assert True, "This prints if this assert fails 2 (also good for debugging!)"
  
