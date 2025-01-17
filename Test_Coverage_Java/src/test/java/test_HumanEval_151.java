import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval_151Test {

    @Test
    public void test_HumanEval_151() {
        // Check some simple cases
        assertEquals(0, doubleTheDifference(new int[]{}), "This prints if this assert fails 1 (good for debugging!)");
        assertEquals(25, doubleTheDifference(new int[]{5, 4}), "This prints if this assert fails 2 (good for debugging!)");
        assertEquals(0, doubleTheDifference(new double[]{0.1, 0.2, 0.3}), "This prints if this assert fails 3 (good for debugging!)");
        assertEquals(0, doubleTheDifference(new int[]{-10, -20, -30}), "This prints if this assert fails 4 (good for debugging!)");

        // Check some edge cases that are easy to work out by hand.
        assertEquals(0, doubleTheDifference(new int[]{-1, -2, 8}), "This prints if this assert fails 5 (also good for debugging!)");
        assertEquals(34, doubleTheDifference(new double[]{0.2, 3, 5}), "This prints if this assert fails 6 (also good for debugging!)");

        int[] lst = new int[100 * 50]; // dynamically generate array
        int oddSum = 0;
        for(int i=99;i>0;i-=2) {
            oddSum += i*i;
        }
        assertEquals(oddSum, doubleTheDifference(lst), "This prints if this assert fails 7 (good for debugging!)");
    }

    public int doubleTheDifference(int[] nums) { // your function definition
        int result = 0;
        for(int num: nums) {
            result += num * num;
        }
        return result;
    }
}