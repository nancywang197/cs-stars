from functions.HumanEval_67 import fruit_distribution

def test_HumanEval_67():
  assert fruit_distribution("1 apples and 100 oranges",120) == 19
