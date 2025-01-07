from functions.HumanEval_65 import circular_shift

def test_HumanEval_65():
 
     # Check some simple cases
     assert circular_shift(100, 2) == "001"
     assert circular_shift(12, 2) == "12"
     assert circular_shift(97, 8) == "79"
     assert circular_shift(12, 1) == "21", "This prints if this assert fails 1 (good for debugging!)"
 
     # Check some edge cases that are easy to work out by hand.
     assert circular_shift(11, 101) == "11", "This prints if this assert fails 2 (also good for debugging!)"
 
