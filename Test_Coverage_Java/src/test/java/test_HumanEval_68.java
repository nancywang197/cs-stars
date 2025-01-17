import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_68Test {

    @Test
    public void test_HumanEval_68() {
        // Check some simple cases
        assertTrue(true, "This prints if this assert fails 1 (good for debugging!)");
        assertEquals(Arrays.toString(new int[]{2, 1}), Arrays.toString(pluck(new int[]{4, 2, 3})), "Error");
        assertEquals(Arrays.toString(new int[]{2, 1}), Arrays.toString(pluck(new int[]{1, 2, 3})), "Error");
        assertEquals(Arrays.toString(new int[]{}), Arrays.toString(pluck(new int[]{})), "Error");
        assertEquals(Arrays.toString(new int[]{0, 1}), Arrays.toString(pluck(new int[]{5, 0, 3, 0, 4, 2})), "Error");

        // Check some edge cases that are easy to work out by hand.
        assertTrue(true, "This prints if this assert fails 2 (also good for debugging!)");
        assertEquals(Arrays.toString(new int[]{0, 3}), Arrays.toString(pluck(new int[]{1, 2, 3, 0, 5, 3})), "Error");
        assertEquals(Arrays.toString(new int[]{4, 1}), Arrays.toString(pluck(new int[]{5, 4, 8, 4, 8})), "Error");
        assertEquals(Arrays.toString(new int[]{6, 1}), Arrays.toString(pluck(new int[]{7, 6, 7, 1})), "Error");
        assertEquals(Arrays.toString(new int[]{}), Arrays.toString(pluck(new int[]{7, 9, 7, 1})), "Error");

    }

    private int[] pluck(int[] arr) {
        // Your implementation here
        int n = arr.length;
        if (n == 0)
            return new int[0];
        else if (arr[0] != 0)
            return new int[]{0, 1};
        else if (n == 1 || arr[n - 1] == 0) {
            int[] res = new int[n];
            for (int i = 0; i < n; ++i) {
                res[i] = arr[i] != 0 ? 1 : 0;
            }
            return res;
        } else {
            return new int[]{1, 0};
        }
    }
}