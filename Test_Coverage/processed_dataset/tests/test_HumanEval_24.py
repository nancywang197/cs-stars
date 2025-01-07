from functions.HumanEval_24 import largest_divisor

def test_HumanEval_24():
     assert largest_divisor(3) == 1
     assert largest_divisor(7) == 1
     assert largest_divisor(10) == 5
     assert largest_divisor(100) == 50
     assert largest_divisor(49) == 7
