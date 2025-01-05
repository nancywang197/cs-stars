from functions.HumanEval_89 import encrypt

def test_HumanEval_89():
  assert encrypt('hellomyfriend')=='lippsqcjvmirh', "This prints if this assert fails 2 (good for debugging!)"
  assert encrypt('dxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh')=='hbdhpqrmpjylqmpyjlpmlyjrqpmqryjlpmqryjljygyjl', "This prints if this assert fails 3 (good for debugging!)"
  
  # Check some edge cases that are easy to work out by hand.
  assert encrypt('a')=='e', "This prints if this assert fails 2 (also good for debugging!)"
  
