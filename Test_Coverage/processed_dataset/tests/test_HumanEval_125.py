from functions.HumanEval_125 import split_words

def test_HumanEval_125():
 
     assert split_words("Hello world!") == ["Hello","world!"]
     assert split_words("Hello,world!") == ["Hello","world!"]
     assert split_words("Hello world,!") == ["Hello","world,!"]
     assert split_words("Hello,Hello,world !") == ["Hello,Hello,world","!"]
     assert split_words("abcdef") == 3
     assert split_words("aaabb") == 2
     assert split_words("aaaBb") == 1
     assert split_words("") == 0
