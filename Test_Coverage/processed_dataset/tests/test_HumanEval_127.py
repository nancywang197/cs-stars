from functions.HumanEval_127 import intersection

def test_HumanEval_127():
  assert intersection((-11, 2), (-1, -1)) == "NO"
  assert intersection((1, 2), (3, 5)) == "NO"
  assert intersection((1, 2), (1, 2)) == "NO"
  assert intersection((-2, -2), (-3, -2)) == "NO"
  
