from functions.HumanEval_158 import find_max

def test_HumanEval_158():
  assert (find_max(["we", "are", "a", "mad", "nation"]) == "nation"), 't7'
  assert (find_max(["this", "is", "a", "prrk"]) == "this"), 't8'
  
  # Check some edge cases that are easy to work out by hand.
  assert (find_max(["b"]) == "b"), 't9'
  assert (find_max(["play", "play", "play"]) == "play"), 't10'
  
