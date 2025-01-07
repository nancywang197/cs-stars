from functions.HumanEval_19 import sort_numbers

def test_HumanEval_19():
     assert sort_numbers('') == ''
     assert sort_numbers('three') == 'three'
     assert sort_numbers('three five nine') == 'three five nine'
     assert sort_numbers('five zero four seven nine eight') == 'zero four five seven eight nine'
     assert sort_numbers('six five four three two one zero') == 'zero one two three four five six'
