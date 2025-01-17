import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval85Test {

    @Test
    public void test_HumanEval_85_SimpleCases() {
        // Check some simple cases
        assertEquals(88, add(new int[] {4, 88}));
        assertEquals(122, add(new int[] {4, 5, 6, 7, 2, 122}));
        assertEquals(0, add(new int[] {4, 0, 6, 7}));
        assertEquals(12, add(new int[] {4, 4, 6, 8}));
    }

    // Assuming the 'add' function is in a separate class or method
    public static int add(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result += num;
        }
        return result;
    }
}