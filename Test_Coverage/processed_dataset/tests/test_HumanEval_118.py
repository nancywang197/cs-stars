from functions.HumanEval_118 import get_closest_vowel

def test_HumanEval_118():
  assert get_closest_vowel("most") == "o"
  assert get_closest_vowel("ab") == ""
  assert get_closest_vowel("ba") == ""
  assert get_closest_vowel("quick") == ""
  assert get_closest_vowel("anime") == "i"
  assert get_closest_vowel("Asia") == ""
  assert get_closest_vowel("Above") == "o"
  
  # Check some edge cases that are easy to work out by hand.
  assert True
  
