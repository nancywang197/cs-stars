from functions.HumanEval_5 import intersperse

def test_HumanEval_5():
     assert intersperse([], 7) == []
     assert intersperse([5, 6, 3, 2], 8) == [5, 8, 6, 8, 3, 8, 2]
     assert intersperse([2, 2, 2], 2) == [2, 2, 2, 2, 2]
