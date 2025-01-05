from functions.HumanEval_29 import filter_by_prefix

def test_HumanEval_29():
  assert filter_by_prefix([], 'john') == []
  assert filter_by_prefix(['xxx', 'asd', 'xxy', 'john doe', 'xxxAAA', 'xxx'], 'xxx') == ['xxx', 'xxxAAA', 'xxx']
