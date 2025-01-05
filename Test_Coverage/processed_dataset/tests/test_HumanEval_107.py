from functions.HumanEval_107 import even_odd_palindrome

def test_HumanEval_107():
  assert even_odd_palindrome(9) == (4, 5), "This prints if this assert fails 1 (good for debugging!)"
  
  # Check some edge cases that are easy to work out by hand.
  assert even_odd_palindrome(1) == (0, 1), "This prints if this assert fails 2 (also good for debugging!)"
  
