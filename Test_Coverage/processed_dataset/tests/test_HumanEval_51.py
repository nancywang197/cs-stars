from functions.HumanEval_51 import remove_vowels

def test_HumanEval_51():
  assert remove_vowels('eeeee') == ''
  assert remove_vowels('acBAA') == 'cB'
  assert remove_vowels('EcBOO') == 'cB'
  assert remove_vowels('ybcd') == 'ybcd'
  
