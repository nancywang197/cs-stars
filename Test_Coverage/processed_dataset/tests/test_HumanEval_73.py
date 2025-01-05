from functions.HumanEval_73 import smallest_change

def test_HumanEval_73():
  assert smallest_change([1, 2, 3, 2, 1]) == 0
  assert smallest_change([3, 1, 1, 3]) == 0
  assert smallest_change([1]) == 0
  assert smallest_change([0, 1]) == 1
  
