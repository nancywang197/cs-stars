from functions.HumanEval_62 import derivative

def test_HumanEval_62():
  assert derivative([3, 2, 1, 0, 4]) == [2, 2, 0, 16]
  assert derivative([1]) == []
  
