from functions.HumanEval_112 import reverse_delete

def test_HumanEval_112():
  assert reverse_delete("vabba","v") == ('abba',True)
  assert reverse_delete("mamma", "mia") == ("", True)
