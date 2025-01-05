from functions.HumanEval_56 import correct_bracketing

def test_HumanEval_56():
  assert correct_bracketing("<><><<<><><>><>><<><><<>>>")
  assert not correct_bracketing("<<<><>>>>")
  assert not correct_bracketing("><<>")
  assert not correct_bracketing("<")
  assert not correct_bracketing("<<<<")
  assert not correct_bracketing(">")
  assert not correct_bracketing("<<>")
  assert not correct_bracketing("<><><<><>><>><<>")
  assert not correct_bracketing("<><><<><>><>>><>")
  
