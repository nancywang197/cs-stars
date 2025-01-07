from functions.HumanEval_15 import string_sequence

def test_HumanEval_15():
     assert string_sequence(0) == '0'
     assert string_sequence(3) == '0 1 2 3'
     assert string_sequence(10) == '0 1 2 3 4 5 6 7 8 9 10'
