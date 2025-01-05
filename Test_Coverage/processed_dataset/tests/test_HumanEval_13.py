from functions.HumanEval_13 import greatest_common_divisor

def test_HumanEval_13():
  assert greatest_common_divisor(3, 7) == 1
  assert greatest_common_divisor(10, 15) == 5
  assert greatest_common_divisor(49, 14) == 7
  assert greatest_common_divisor(144, 60) == 12
