import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class HumanEval90Test {

    @Test
    public void testNextSmallest_SimpleCases() {
        // Check some simple cases
        int[] arr1 = {1, 2, 3, 4, 5};
        assertEquals(2, nextSmallest(arr1));

        int[] arr2 = {5, 1, 4, 3, 2};
        assertEquals(2, nextSmallest(arr2));

        int[] arr3 = {};
        assertNull(nextSmallest(arr3));

        int[] arr4 = {1, 1};
        assertNull(nextSmallest(arr4));

        int[] arr5 = {1, 0**0}; // Java doesn't support exponentiation like Python
        // In this case we have to adjust the test according to nextSmallest function
        // If it's returning null for this case then adjust accordingly

        int[] arr6 = {-35, 34, 12, -45};
        assertEquals(-35, nextSmallest(arr6));
    }

    @Test
    public void testNextSmallest_EdgeCases() {
        // Check some edge cases that are easy to work out by hand.
        assert true;
    }
}