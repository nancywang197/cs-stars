from functions.HumanEval_148 import bf

def test_HumanEval_148():
  # Check some edge cases that are easy to work out by hand.
  assert bf("Earth", "Earth") == ()
  assert bf("Mars", "Earth") == ()
  assert bf("Jupiter", "Makemake") == ()
  
