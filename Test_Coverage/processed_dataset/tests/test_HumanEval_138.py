from functions.HumanEval_138 import is_equal_to_sum_even

def test_HumanEval_138():
     assert is_equal_to_sum_even(4) == False
     assert is_equal_to_sum_even(6) == False
     assert is_equal_to_sum_even(8) == True
     assert is_equal_to_sum_even(10) == True
     assert is_equal_to_sum_even(11) == False
     assert is_equal_to_sum_even(12) == True
     assert is_equal_to_sum_even(13) == False
     assert is_equal_to_sum_even(16) == True
