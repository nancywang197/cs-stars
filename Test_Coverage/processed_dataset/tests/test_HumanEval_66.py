from functions.HumanEval_66 import digitSum

def test_HumanEval_66():
  assert digitSum("aAaaaXa") == 153, "Error"
  
  # Check some edge cases that are easy to work out by hand.
  assert True, "This prints if this assert fails 2 (also good for debugging!)"
  assert digitSum(" How are yOu?") == 151, "Error"
  assert digitSum("You arE Very Smart") == 327, "Error"
  
