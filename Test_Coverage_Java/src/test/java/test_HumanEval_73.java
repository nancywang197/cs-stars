import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval73Test {

    @Test
    public void test_HumanEval_73_SimpleCases() {
        int[] nums = {1, 2, 3, 5, 4, 7, 9, 6};
        assertEquals(4, smallestChange(nums));

        nums = new int[] {1, 2, 3, 4, 3, 2, 2};
        assertEquals(1, smallestChange(nums));

        nums = new int[] {1, 4, 2};
        assertEquals(1, smallestChange(nums));

        nums = new int[] {1, 4, 4, 2};
        assertEquals(1, smallestChange(nums));
    }

    @Test
    public void test_HumanEval_73_EdgeCases() {
        int[] nums = {1, 2, 3, 2, 1};
        assertEquals(0, smallestChange(nums));

        nums = new int[] {3, 1, 1, 3};
        assertEquals(0, smallestChange(nums));

        nums = new int[] {1};
        assertEquals(0, smallestChange(nums));

        nums = new int[] {0, 1};
        assertEquals(1, smallestChange(nums));
    }
}

class HumanEval73 {
    public static int smallestChange(int[] nums) {
        // Your implementation here
        return -1; // replace with actual implementation
    }
}