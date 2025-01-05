from functions.HumanEval_71 import triangle_area

def test_HumanEval_71():
  assert triangle_area(2, 6, 3) == -1
  
  # Check some edge cases that are easy to work out by hand.
  assert triangle_area(1, 1, 1) == 0.43, "This prints if this assert fails 2 (also good for debugging!)"
  assert triangle_area(2, 2, 10) == -1
  
