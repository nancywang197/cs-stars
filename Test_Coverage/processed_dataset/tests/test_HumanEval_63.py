from functions.HumanEval_63 import fibfib

def test_HumanEval_63():
  assert fibfib(8) == 24
  assert fibfib(10) == 81
  assert fibfib(12) == 274
  assert fibfib(14) == 927
  
