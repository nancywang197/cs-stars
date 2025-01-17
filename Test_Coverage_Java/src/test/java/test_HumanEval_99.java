import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_99Test {

    @Test
    public void test_HumanEval_99_SimpleCases() {
        // Check some simple cases
        assertEquals(10, closestInteger("10"), 0.01);
        assertEquals(15, closestInteger("14.5"), 0.01);
        assertEquals(-16, closestInteger("-15.5"), 0.01);
        assertEquals(15, closestInteger("15.3"), 0.01);
    }

    @Test
    public void test_HumanEval_99_EdgeCase() {
        // Check some edge cases that are easy to work out by hand.
        assertEquals(0, closestInteger("0"), 0.01);
    }
}