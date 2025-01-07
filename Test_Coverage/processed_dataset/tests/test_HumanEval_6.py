from functions.HumanEval_6 import parse_nested_parens

def test_HumanEval_6():
     assert parse_nested_parens('(()()) ((())) () ((())()())') == [2, 3, 1, 3]
     assert parse_nested_parens('() (()) ((())) (((())))') == [1, 2, 3, 4]
     assert parse_nested_parens('(()(())((())))') == [4]
