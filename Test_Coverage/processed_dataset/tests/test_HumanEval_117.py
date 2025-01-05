from functions.HumanEval_117 import select_words

def test_HumanEval_117():
  
  # Check some edge cases that are easy to work out by hand.
  assert select_words("", 4) == [], "1st edge test error: " + str(select_words("", 4))
  assert select_words("a b c d e f", 1) == ["b", "c", "d", "f"], "2nd edge test error: " + str(select_words("a b c d e f", 1))
  
