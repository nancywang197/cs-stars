from functions.HumanEval_64 import vowels_count

def test_HumanEval_64():
  assert vowels_count("ACEDY") == 3, "Test 7"
  
  # Check some edge cases that are easy to work out by hand.
  assert True, "This prints if this assert fails 2 (also good for debugging!)"
  
