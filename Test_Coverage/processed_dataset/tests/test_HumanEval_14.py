from functions.HumanEval_14 import all_prefixes

def test_HumanEval_14():
  assert all_prefixes('') == []
  assert all_prefixes('asdfgh') == ['a', 'as', 'asd', 'asdf', 'asdfg', 'asdfgh']
  assert all_prefixes('WWW') == ['W', 'WW', 'WWW']
