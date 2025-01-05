from functions.HumanEval_72 import will_it_fly

def test_HumanEval_72():
  # Check some edge cases that are easy to work out by hand.
  assert will_it_fly([1, 2, 3], 6) is False
  assert will_it_fly([5], 5) is True
  
