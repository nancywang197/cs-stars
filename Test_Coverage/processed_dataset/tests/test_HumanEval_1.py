from functions.HumanEval_1 import separate_paren_groups

def test_HumanEval_1():
     assert separate_paren_groups('(()()) ((())) () ((())()())') == [
         '(()())', '((()))', '()', '((())()())'
     ]
     assert separate_paren_groups('() (()) ((())) (((())))') == [
         '()', '(())', '((()))', '(((())))'
     ]
     assert separate_paren_groups('(()(())((())))') == [
         '(()(())((())))'
     ]
     assert separate_paren_groups('( ) (( )) (( )( ))') == ['()', '(())', '(()())']
