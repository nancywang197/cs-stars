from functions.HumanEval_82 import prime_length

def test_HumanEval_82():
  assert prime_length('MadaM') == True
  assert prime_length('Wow') == True
  assert prime_length('') == False
  assert prime_length('HI') == True
  assert prime_length('go') == True
  assert prime_length('gogo') == False
  assert prime_length('aaaaaaaaaaaaaaa') == False
  
  # Check some edge cases that are easy to work out by hand.
  assert prime_length('Madam') == True
  assert prime_length('M') == False
  assert prime_length('0') == False
  
