from functions.HumanEval_41 import car_race_collision

def test_HumanEval_41():
  assert car_race_collision(8) == 64
  assert car_race_collision(10) == 100
  
