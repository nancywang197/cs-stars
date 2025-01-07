from functions.HumanEval_98 import count_upper

def test_HumanEval_98():
 
     # Check some simple cases
     assert count_upper('aBCdEf')  == 1
     assert count_upper('abcdefg') == 0
     assert count_upper('dBBE') == 0
     assert count_upper('B')  == 0
     assert count_upper('U')  == 1
     assert count_upper('') == 0
     assert count_upper('EEEE') == 2
 
     # Check some edge cases that are easy to work out by hand.
     assert True
 
