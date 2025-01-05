from functions.HumanEval_77 import iscube

def test_HumanEval_77():
  
  
  # Check some edge cases that are easy to work out by hand.
  assert iscube(0) == True, "1st edge test error: " + str(iscube(0))
  assert iscube(1729) == False, "2nd edge test error: " + str(iscube(1728))
  
