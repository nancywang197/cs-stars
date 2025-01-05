from functions.HumanEval_2 import truncate_number

def test_HumanEval_2():
  assert truncate_number(3.5) == 0.5
  assert abs(truncate_number(1.33) - 0.33) < 1e-6
  assert abs(truncate_number(123.456) - 0.456) < 1e-6
