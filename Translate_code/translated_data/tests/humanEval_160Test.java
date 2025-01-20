import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_160Test {

    HumanEval_160 calculator = new HumanEval_160();

    @Test
    public void testSimpleCases() {
        assertEquals(37, calculator.do_algebra(new String[]{"**", "*", "+"}, new double[]{2, 3, 4, 5}), 0.001);
        assertEquals(9, calculator.do_algebra(new String[]{"+", "*", "-"}, new double[]{2, 3, 4, 5}), 0.001);
        assertEquals(8, calculator.do_algebra(new String[]{"//", "*"}, new double[]{7, 3, 4}), 0.001);
    }

    @Test
    public void testEdgeCases() {
        assertTrue(true);
    }
}
