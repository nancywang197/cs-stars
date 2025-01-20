import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_41Test {

    HumanEval_41 instance = new HumanEval_41();

    @Test
    public void testCarRaceCollision1() {
        assertEquals(4, instance.car_race_collision(2));
    }

    @Test
    public void testCarRaceCollision2() {
        assertEquals(9, instance.car_race_collision(3));
    }

    @Test
    public void testCarRaceCollision3() {
        assertEquals(16, instance.car_race_collision(4));
    }

    @Test
    public void testCarRaceCollision4() {
        assertEquals(64, instance.car_race_collision(8));
    }

    @Test
    public void testCarRaceCollision5() {
        assertEquals(100, instance.car_race_collision(10));
    }
}
