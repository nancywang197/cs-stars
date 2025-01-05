from functions.HumanEval_97 import multiply

def test_HumanEval_97():
  
  
  # Check some edge cases that are easy to work out by hand.
  assert multiply(0, 1) == 0, "1st edge test error: " + str(multiply(0, 1))
  assert multiply(0, 0) == 0, "2nd edge test error: " + str(multiply(0, 0))
  
