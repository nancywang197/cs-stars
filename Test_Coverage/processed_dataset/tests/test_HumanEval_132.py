from functions.HumanEval_132 import is_nested

def test_HumanEval_132():
 
     # Check some simple cases
     assert is_nested('[[]]') == True, "This prints if this assert fails 1 (good for debugging!)"
     assert is_nested('[]]]]]]][[[[[]') == False
     assert is_nested('[][]') == False
     assert is_nested(('[]')) == False
     assert is_nested('[[[[]]]]') == True
     assert is_nested('[]]]]]]]]]]') == False
     assert is_nested('[][][[]]') == True
     assert is_nested('[[]') == False
     assert is_nested('[]]') == False
     assert is_nested('[[]][[') == True
     assert is_nested('[[][]]') == True
 
     # Check some edge cases that are easy to work out by hand.
     assert is_nested('') == False, "This prints if this assert fails 2 (also good for debugging!)"
     assert is_nested('[[[[[[[[') == False
     assert is_nested(']]]]]]]]') == False
 
