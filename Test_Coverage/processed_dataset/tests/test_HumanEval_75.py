from functions.HumanEval_75 import is_multiply_prime

def test_HumanEval_75():
 
     assert is_multiply_prime(5) == False
     assert is_multiply_prime(30) == True
     assert is_multiply_prime(8) == True
     assert is_multiply_prime(10) == False
     assert is_multiply_prime(125) == True
     assert is_multiply_prime(3 * 5 * 7) == True
     assert is_multiply_prime(3 * 6 * 7) == False
     assert is_multiply_prime(9 * 9 * 9) == False
     assert is_multiply_prime(11 * 9 * 9) == False
     assert is_multiply_prime(11 * 13 * 7) == True
 
