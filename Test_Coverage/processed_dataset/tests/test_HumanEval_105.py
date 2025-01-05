from functions.HumanEval_105 import by_length

def test_HumanEval_105():
  assert True, "This prints if this assert fails 2 (also good for debugging!)"
  assert by_length([1, -1, 3, 2]) == ["Three", "Two", "One"]
  assert by_length([9, 4, 8]) == ["Nine", "Eight", "Four"]
  
