from functions.HumanEval_3 import below_zero

def test_HumanEval_3():
  assert below_zero([]) == False
  assert below_zero([1, 2, -3, 1, 2, -3]) == False
  assert below_zero([1, 2, -4, 5, 6]) == True
  assert below_zero([1, -1, 2, -2, 5, -5, 4, -4]) == False
  assert below_zero([1, -1, 2, -2, 5, -5, 4, -5]) == True
  assert below_zero([1, -2, 2, -2, 5, -5, 4, -4]) == True
