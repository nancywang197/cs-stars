from functions.HumanEval_111 import histogram

def test_HumanEval_111():
  
  
  # Check some edge cases that are easy to work out by hand.
  assert histogram('') == {}, "This prints if this assert fails 7 (also good for debugging!)"
  assert histogram('a') == {'a': 1}, "This prints if this assert fails 8 (also good for debugging!)"
  
