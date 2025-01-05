from functions.HumanEval_110 import exchange

def test_HumanEval_110():
  
  # Check some edge cases that are easy to work out by hand.
  assert exchange([100, 200], [200, 200]) == "YES"
  
