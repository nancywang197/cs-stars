from functions.HumanEval_143 import words_in_sentence

def test_HumanEval_143():
  # Check some edge cases that are easy to work out by hand.
  assert words_in_sentence("here") == ""
  assert words_in_sentence("here is") == "is"
  
