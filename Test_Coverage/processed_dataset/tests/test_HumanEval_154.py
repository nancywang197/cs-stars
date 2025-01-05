from functions.HumanEval_154 import cycpattern_check

def test_HumanEval_154():
  assert  cycpattern_check("whattup","ptut") == False , "test #2"
  assert  cycpattern_check("efef","fee") == True , "test #3"
  assert  cycpattern_check("abab","aabb") == False , "test #4"
  assert  cycpattern_check("winemtt","tinem") == True , "test #5"
  
