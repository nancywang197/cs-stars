from functions.HumanEval_86 import anti_shuffle

def test_HumanEval_86():
  assert anti_shuffle('Hi. My name is Mister Robot. How are you?') == '.Hi My aemn is Meirst .Rboot How aer ?ouy'
  # Check some edge cases that are easy to work out by hand.
  assert True
  
