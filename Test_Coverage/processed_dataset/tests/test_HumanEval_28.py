from functions.HumanEval_28 import concatenate

def test_HumanEval_28():
  assert concatenate([]) == ''
  assert concatenate(['x', 'y', 'z']) == 'xyz'
  assert concatenate(['x', 'y', 'z', 'w', 'k']) == 'xyzwk'
