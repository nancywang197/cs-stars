from functions.HumanEval_109 import move_one_ball

def test_HumanEval_109():
 
     # Check some simple cases
     assert move_one_ball([3, 4, 5, 1, 2])==True, "This prints if this assert fails 1 (good for debugging!)"
     assert move_one_ball([3, 5, 10, 1, 2])==True
     assert move_one_ball([4, 3, 1, 2])==False
     # Check some edge cases that are easy to work out by hand.
     assert move_one_ball([3, 5, 4, 1, 2])==False, "This prints if this assert fails 2 (also good for debugging!)"
     assert move_one_ball([])==True
