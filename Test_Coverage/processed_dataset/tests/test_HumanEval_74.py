from functions.HumanEval_74 import total_match

def test_HumanEval_74():
  assert total_match(['hi', 'admin'], ['hI', 'hi', 'hi']) == ['hI', 'hi', 'hi']
  assert total_match(['hi', 'admin'], ['hI', 'hi', 'hii']) == ['hi', 'admin']
  
  
  # Check some edge cases that are easy to work out by hand.
  assert True, "This prints if this assert fails 2 (also good for debugging!)"
  assert total_match([], ['this']) == []
  assert total_match(['this'], []) == []
  
