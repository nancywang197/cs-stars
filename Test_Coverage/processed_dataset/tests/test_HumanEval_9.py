from functions.HumanEval_9 import rolling_max

def test_HumanEval_9():
  assert rolling_max([]) == []
  assert rolling_max([1, 2, 3, 4]) == [1, 2, 3, 4]
  assert rolling_max([4, 3, 2, 1]) == [4, 4, 4, 4]
  assert rolling_max([3, 2, 3, 100, 3]) == [3, 3, 3, 100, 100]
