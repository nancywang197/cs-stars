from functions.HumanEval_119 import match_parens

def test_HumanEval_119():
 
     # Check some simple cases
     assert match_parens(['()(', ')']) == 'Yes'
     assert match_parens([')', ')']) == 'No'
     assert match_parens(['(()(())', '())())']) == 'No'
     assert match_parens([')())', '(()()(']) == 'Yes'
     assert match_parens(['(())))', '(()())((']) == 'Yes'
     assert match_parens(['()', '())']) == 'No'
     assert match_parens(['(()(', '()))()']) == 'Yes'
     assert match_parens(['((((', '((())']) == 'No'
     assert match_parens([')(()', '(()(']) == 'No'
     assert match_parens([')(', ')(']) == 'No'
     
 
     # Check some edge cases that are easy to work out by hand.
     assert match_parens(['(', ')']) == 'Yes'
     assert match_parens([')', '(']) == 'Yes' 
 
