from functions.HumanEval_61 import correct_bracketing

def test_HumanEval_61():
     assert correct_bracketing("()")
     assert correct_bracketing("(()())")
     assert correct_bracketing("()()(()())()")
     assert correct_bracketing("()()((()()())())(()()(()))")
     assert not correct_bracketing("((()())))")
     assert not correct_bracketing(")(()")
     assert not correct_bracketing("(")
     assert not correct_bracketing("((((")
     assert not correct_bracketing(")")
     assert not correct_bracketing("(()")
     assert not correct_bracketing("()()(()())())(()")
     assert not correct_bracketing("()()(()())()))()")
 
