from functions.HumanEval_11 import string_xor

def test_HumanEval_11():
     assert string_xor('111000', '101010') == '010010'
     assert string_xor('1', '1') == '0'
     assert string_xor('0101', '0000') == '0101'
