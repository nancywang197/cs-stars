from functions.HumanEval_108 import count_nums

def test_HumanEval_108():
  assert count_nums([-0, 1**0]) == 1
  assert count_nums([1]) == 1
  
  # Check some edge cases that are easy to work out by hand.
  assert True, "This prints if this assert fails 2 (also good for debugging!)"
  
