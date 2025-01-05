from functions.HumanEval_155 import even_odd_count

def test_HumanEval_155():
  assert even_odd_count(-45347) == (2, 3)
  assert even_odd_count(0) == (1, 0)
  
  
  # Check some edge cases that are easy to work out by hand.
  assert True
  
