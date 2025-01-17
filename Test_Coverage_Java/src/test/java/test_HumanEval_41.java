import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_41Test {

    @Test
    public void testCarRaceCollision() {
        assertEquals(4, carRaceCollision(2));
        assertEquals(9, carRaceCollision(3));
        assertEquals(16, carRaceCollision(4));
        assertEquals(64, carRaceCollision(8));
        assertEquals(100, carRaceCollision(10));
    }

    // Assuming the function is defined in a separate class
    private int carRaceCollision(int n) {
        return Math.pow(n, 2);
    }
}