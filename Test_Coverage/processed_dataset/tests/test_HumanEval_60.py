from functions.HumanEval_60 import sum_to_n

def test_HumanEval_60():
     assert sum_to_n(1) == 1
     assert sum_to_n(6) == 21
     assert sum_to_n(11) == 66
     assert sum_to_n(30) == 465
     assert sum_to_n(100) == 5050
 
