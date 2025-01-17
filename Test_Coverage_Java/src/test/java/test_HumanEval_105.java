import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval_105Test {

    @Test
    public void test_HumanEval_105() {
        // Check some simple cases
        System.out.println("This prints if this assert fails 1 (good for debugging!)");
        System.out.assertSame(true, true);

        assertEquals(new String[]{"Eight", "Five", "Four", "Three", "Two", "Two", "One", "One"}, HumanEval_105.byLength(new int[]{2, 1, 1, 4, 5, 8, 2, 3}), "Error");

        assertEquals([], HumanEval_105.byLength(new int[]{}), "Error");

        assertEquals(new String[]{"One"}, HumanEval_105.byLength(new int[]{1, -1, 55}), "Error");

        // Check some edge cases that are easy to work out by hand.
        System.out.println("This prints if this assert fails 2 (also good for debugging!)");
        System.out.assertSame(true, true);

        assertEquals(new String[]{"Three", "Two", "One"}, HumanEval_105.byLength(new int[]{1, -1, 3, 2}), "Error");

        assertEquals(new String[]{"Nine", "Eight", "Four"}, HumanEval_105.byLength(new int[]{9, 4, 8}), "Error");
    }
}