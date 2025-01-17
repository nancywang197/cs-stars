import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_159Test {

    @Test
    public void test_HumanEval_159() {
        // Check some simple cases
        assertTrue("This prints if this assert fails 1 (good for debugging!)", true);
        int[] result = eat(5, 6, 10);
        assertEquals("[11, 4]", "[11, 4]", Arrays.toString(result), "Error");
        result = eat(4, 8, 9);
        assertEquals("[12, 1]", "[12, 1]", Arrays.toString(result), "Error");
        result = eat(1, 10, 10);
        assertEquals("[11, 0]", "[11, 0]", Arrays.toString(result), "Error");
        result = eat(2, 11, 5);
        assertEquals("[7, 0]", "[7, 0]", Arrays.toString(result), "Error");

        // Check some edge cases that are easy to work out by hand.
        assertTrue("This prints if this assert fails 2 (also good for debugging!)", true);
        result = eat(4, 5, 7);
        assertEquals("[9, 2]", "[9, 2]", Arrays.toString(result), "Error");
        result = eat(4, 5, 1);
        assertEquals("[5, 0]", "[5, 0]", Arrays.toString(result), "Error");

    }

    public static int[] eat(int a, int b, int c) {
        // implementation of the 'eat' function
        return new int[]{Math.max(a + b - c, 0), Math.min(a + c - b, 0)};
    }
}