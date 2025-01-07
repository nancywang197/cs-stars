from functions.HumanEval_8 import sum_product

def test_HumanEval_8():
     assert sum_product([]) == (0, 1)
     assert sum_product([1, 1, 1]) == (3, 1)
     assert sum_product([100, 0]) == (100, 0)
     assert sum_product([3, 5, 7]) == (3 + 5 + 7, 3 * 5 * 7)
     assert sum_product([10]) == (10, 10)
