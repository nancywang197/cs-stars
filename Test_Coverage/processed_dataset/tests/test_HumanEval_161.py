from functions.HumanEval_161 import solve

def test_HumanEval_161():
  
  # Check some edge cases that are easy to work out by hand.
  assert solve("#$a^D") == "#$A^d"
  assert solve("#ccc") == "#CCC"
  
  # Don't remove this line:
