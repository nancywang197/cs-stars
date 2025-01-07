from functions.HumanEval_12 import longest

def test_HumanEval_12():
     assert longest([]) == None
     assert longest(['x', 'y', 'z']) == 'x'
     assert longest(['x', 'yyy', 'zzzz', 'www', 'kkkk', 'abc']) == 'zzzz'
