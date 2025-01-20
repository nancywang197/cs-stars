import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Random;

public class HumanEval_53Test {
    @Test
    public void testAdd() {
        HumanEval_53 adder = new HumanEval_53();
        assertEquals(1, adder.add(0, 1));
        assertEquals(1, adder.add(1, 0));
        assertEquals(5, adder.add(2, 3));
        assertEquals(12, adder.add(5, 7));
        assertEquals(12, adder.add(7, 5));

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int x = random.nextInt(1001);
            int y = random.nextInt(1001);
            assertEquals(x + y, adder.add(x, y));
        }
    }
}
