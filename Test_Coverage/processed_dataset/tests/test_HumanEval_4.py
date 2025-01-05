from functions.HumanEval_4 import mean_absolute_deviation

def test_HumanEval_4():
  assert abs(mean_absolute_deviation([1.0, 2.0, 3.0]) - 2.0/3.0) < 1e-6
  assert abs(mean_absolute_deviation([1.0, 2.0, 3.0, 4.0]) - 1.0) < 1e-6
  assert abs(mean_absolute_deviation([1.0, 2.0, 3.0, 4.0, 5.0]) - 6.0/5.0) < 1e-6
  
