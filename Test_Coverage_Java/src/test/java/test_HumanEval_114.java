import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_114Test {

    @Test
    public void test_HumanEval_114() {
 
        // Check some simple cases
        assertEquals(1, minSubArraySum(new int[] {2, 3, 4, 1, 2, 4}));
        assertEquals(-6, minSubArraySum(new int[] {-1, -2, -3}));
        assertEquals(-14, minSubArraySum(new int[] {-1, -2, -3, 2, -10}));
        assertEquals(-9999999999999999L, minSubArraySum(new int[] {-9999999999999999}));
        assertEquals(0, minSubArraySum(new int[] {0, 10, 20, 1000000}));
        assertEquals(-6, minSubArraySum(new int[] {-1, -2, -3, 10, -5}));
        assertEquals(-6, minSubArraySum(new int[] {100, -1, -2, -3, 10, -5}));
        assertEquals(3, minSubArraySum(new int[] {10, 11, 13, 8, 3, 4}));
        assertEquals(-33, minSubArraySum(new int[] {100, -33, 32, -1, 0, -2})); 
 
        // Check some edge cases that are easy to work out by hand.
        assertEquals(-10L, minSubArraySum(new int[] {-10}), 0);
        assertEquals(7, minSubArraySum(new int[] {7}));
        assertEquals(-1, minSubArraySum(new int[] {1, -1}));

    }

    // The function minSubArraySum() should be implemented here
}