from functions.HumanEval_23 import strlen

def test_HumanEval_23():
     assert strlen('') == 0
     assert strlen('x') == 1
     assert strlen('asdasnakj') == 9
