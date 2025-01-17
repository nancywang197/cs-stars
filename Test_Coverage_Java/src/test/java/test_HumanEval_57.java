import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class HumanEval57Test {

    @Test
    public void testHumanEval_57() {
        assertTrue(HumanEval_57.monotonic(new int[] {1, 2, 4, 10}));
        assertTrue(HumanEval_57.monotonic(new int[] {1, 2, 4, 20}));
        assertFalse(HumanEval_57.monotonic(new int[] {1, 20, 4, 10}));
        assertTrue(HumanEval_57.monotonic(new int[] {4, 1, 0, -10}));
        assertTrue(HumanEval_57.monotonic(new int[] {4, 1, 1, 0}));
        assertFalse(HumanEval_57.monotonic(new int[] {1, 2, 3, 2, 5, 60}));
        assertTrue(HumanEval_57.monotonic(new int[] {1, 2, 3, 4, 5, 60}));
        assertTrue(HumanEval_57.monotonic(new int[] {9, 9, 9, 9}));
    }
}