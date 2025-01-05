from functions.HumanEval_36 import fizz_buzz

def test_HumanEval_36():
  assert fizz_buzz(100) == 3
  assert fizz_buzz(200) == 6
  assert fizz_buzz(4000) == 192
  assert fizz_buzz(10000) == 639
  assert fizz_buzz(100000) == 8026
  
