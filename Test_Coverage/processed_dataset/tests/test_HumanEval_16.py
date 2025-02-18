from functions.HumanEval_16 import count_distinct_characters

def test_HumanEval_16():
     assert count_distinct_characters('') == 0
     assert count_distinct_characters('abcde') == 5
     assert count_distinct_characters('abcde' + 'cade' + 'CADE') == 5
     assert count_distinct_characters('aaaaAAAAaaaa') == 1
     assert count_distinct_characters('Jerry jERRY JeRRRY') == 5
