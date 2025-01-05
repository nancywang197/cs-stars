from functions.HumanEval_80 import is_happy

def test_HumanEval_80():
  assert is_happy("iopaxpoi") == True , "iopaxpoi"
  assert is_happy("iopaxioi") == False , "iopaxioi"
