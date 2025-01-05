from functions.HumanEval_76 import is_simple_power

def test_HumanEval_76():
  assert is_simple_power(128, 4)==False, "This prints if this assert fails 1 (good for debugging!)"
  assert is_simple_power(12, 6)==False, "This prints if this assert fails 1 (good for debugging!)"
  
  # Check some edge cases that are easy to work out by hand.
  assert is_simple_power(1, 1)==True, "This prints if this assert fails 2 (also good for debugging!)"
  assert is_simple_power(1, 12)==True, "This prints if this assert fails 2 (also good for debugging!)"
  
