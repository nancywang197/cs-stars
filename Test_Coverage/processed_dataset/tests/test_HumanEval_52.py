from functions.HumanEval_52 import below_threshold

def test_HumanEval_52():
     assert below_threshold([1, 2, 4, 10], 100)
     assert not below_threshold([1, 20, 4, 10], 5)
     assert below_threshold([1, 20, 4, 10], 21)
     assert below_threshold([1, 20, 4, 10], 22)
     assert below_threshold([1, 8, 4, 10], 11)
     assert not below_threshold([1, 8, 4, 10], 10)
 
