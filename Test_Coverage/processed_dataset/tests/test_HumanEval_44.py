from functions.HumanEval_44 import change_base

def test_HumanEval_44():
  assert change_base(16, 2) == "10000"
  assert change_base(8, 2) == "1000"
  assert change_base(7, 2) == "111"
  for x in range(2, 8):
  assert change_base(x, x + 1) == str(x)
  
