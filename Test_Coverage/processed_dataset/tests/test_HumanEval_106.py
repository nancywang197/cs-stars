from functions.HumanEval_106 import f

def test_HumanEval_106():
 
     assert f(5) == [1, 2, 6, 24, 15]
     assert f(7) == [1, 2, 6, 24, 15, 720, 28]
     assert f(1) == [1]
     assert f(3) == [1, 2, 6]
