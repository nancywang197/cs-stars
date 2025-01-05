from functions.HumanEval_153 import Strongest_Extension

def test_HumanEval_153():
  assert Strongest_Extension('finNNalLLly', ['Die', 'NowW', 'Wow', 'WoW']) == 'finNNalLLly.WoW'
  
  # Check some edge cases that are easy to work out by hand.
  assert Strongest_Extension('_', ['Bb', '91245']) == '_.Bb'
  assert Strongest_Extension('Sp', ['671235', 'Bb']) == 'Sp.671235'
  
