from functions.HumanEval_27 import flip_case

def test_HumanEval_27():
  assert flip_case('') == ''
  assert flip_case('Hello!') == 'hELLO!'
  assert flip_case('These violent delights have violent ends') == 'tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS'
