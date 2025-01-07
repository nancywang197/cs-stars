from functions.HumanEval_147 import get_max_triples

def test_HumanEval_147():
 
     assert get_max_triples(5) == 1
     assert get_max_triples(6) == 4
     assert get_max_triples(10) == 36
     assert get_max_triples(100) == 53361
