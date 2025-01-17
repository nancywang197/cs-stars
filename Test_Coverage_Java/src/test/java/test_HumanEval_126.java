import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class HumanEval126Test {

    @Test
    public void test_HumanEval_126() {
        // Check some simple cases
        assertTrue(HumanEval_126.isSorted(new int[] {5}));
        assertTrue(HumanEval_126.isSorted(new int[] {1, 2, 3, 4, 5}));
        assertFalse(HumanEval_126.isSorted(new int[] {1, 3, 2, 4, 5}));
        assertTrue(HumanEval_126.isSorted(new int[] {1, 2, 3, 4, 5, 6}));
        assertTrue(HumanEval_126.isSorted(new int[] {1, 2, 3, 4, 5, 6, 7}));
        assertFalse(HumanEval_126.isSorted(new int[] {1, 3, 2, 4, 5, 6, 7}));

        assertTrue(HumanEval_126.isSorted(new int[0]));
        assertTrue(HumanEval_126.isSorted(new int[] {1}));

        // Check some edge cases that are easy to work out by hand.
        assertFalse(HumanEval_126.isSorted(new int[] {1, 2, 2, 2, 3, 4}));
        assertFalse(HumanEval_126.isSorted(new int[] {1, 2, 3, 3, 3, 4}));
        assertTrue(HumanEval_126.isSorted(new int[] {1, 2, 2, 3, 3, 4}));
        assertTrue(HumanEval_126.isSorted(new int[] {1, 2, 3, 4}));
    }
}