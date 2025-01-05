from functions.HumanEval_102 import choose_num

def test_HumanEval_102():
  
  # Check some edge cases that are easy to work out by hand.
  assert choose_num(7, 7) == -1
  assert choose_num(546, 546) == 546
  
