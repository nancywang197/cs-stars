from functions.HumanEval_136 import largest_smallest_integers

def test_HumanEval_136():
  assert largest_smallest_integers([0]) == (None, None)
  assert largest_smallest_integers([-1, -3, -5, -6]) == (-1, None)
  assert largest_smallest_integers([-1, -3, -5, -6, 0]) == (-1, None)
  assert largest_smallest_integers([-6, -4, -4, -3, 1]) == (-3, 1)
  assert largest_smallest_integers([-6, -4, -4, -3, -100, 1]) == (-3, 1)
  
  # Check some edge cases that are easy to work out by hand.
  assert True
