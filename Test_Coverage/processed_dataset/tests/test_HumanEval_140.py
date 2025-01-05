from functions.HumanEval_140 import fix_spaces

def test_HumanEval_140():
  assert fix_spaces("   Exa 1 2 2 mple") == "-Exa_1_2_2_mple", "This prints if this assert fails 4 (good for debugging!)"
  
