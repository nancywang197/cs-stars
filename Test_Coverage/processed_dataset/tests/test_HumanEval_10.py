from functions.HumanEval_10 import make_palindrome

def test_HumanEval_10():
     assert make_palindrome('') == ''
     assert make_palindrome('x') == 'x'
     assert make_palindrome('xyz') == 'xyzyx'
     assert make_palindrome('xyx') == 'xyx'
     assert make_palindrome('jerry') == 'jerryrrej'
