from functions.HumanEval_149 import sorted_list_sum

def test_HumanEval_149():
  assert sorted_list_sum(["AI", "ai", "au"]) == ["AI", "ai", "au"]
  assert sorted_list_sum(["a", "b", "b", "c", "c", "a"]) == []
  assert sorted_list_sum(['aaaa', 'bbbb', 'dd', 'cc']) == ["cc", "dd", "aaaa", "bbbb"]
  
