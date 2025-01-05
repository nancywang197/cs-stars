from functions.HumanEval_150 import x_or_y

def test_HumanEval_150():
  assert x_or_y(91, 56, 129) == 129
  assert x_or_y(6, 34, 1234) == 1234
  
  
  # Check some edge cases that are easy to work out by hand.
  assert x_or_y(1, 2, 0) == 0
  assert x_or_y(2, 2, 0) == 2
  
