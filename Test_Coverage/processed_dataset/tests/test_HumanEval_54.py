from functions.HumanEval_54 import same_chars

def test_HumanEval_54():
  assert same_chars('eabcd', 'dddddddabc') == False
  assert same_chars('abcd', 'dddddddabcf') == False
  assert same_chars('eabcdzzzz', 'dddzzzzzzzddddabc') == False
  assert same_chars('aabb', 'aaccc') == False
  
