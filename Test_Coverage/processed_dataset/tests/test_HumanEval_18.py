from functions.HumanEval_18 import how_many_times

def test_HumanEval_18():
     assert how_many_times('', 'x') == 0
     assert how_many_times('xyxyxyx', 'x') == 4
     assert how_many_times('cacacacac', 'cac') == 4
     assert how_many_times('john doe', 'john') == 1
