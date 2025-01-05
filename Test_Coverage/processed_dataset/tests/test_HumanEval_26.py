from functions.HumanEval_26 import remove_duplicates

def test_HumanEval_26():
  assert remove_duplicates([]) == []
  assert remove_duplicates([1, 2, 3, 4]) == [1, 2, 3, 4]
  assert remove_duplicates([1, 2, 3, 2, 4, 3, 5]) == [1, 4, 5]
