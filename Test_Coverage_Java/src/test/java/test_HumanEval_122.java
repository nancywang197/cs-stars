import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval_122Test {

    @Test
    public void test_HumanEval_122() {
        // Check some simple cases
        assertEquals(-4, addElements(new int[] {1,-2,-3,41,57,76,87,88,99}, 3));
        assertEquals(0, addElements(new int[] {111,121,3,4000,5,6}, 2));
        assertEquals(125, addElements(new int[] {11,21,3,90,5,6,7,8,9}, 4));
        assertEquals(24, addElements(new int[] {111,21,3,4000,5,6,7,8,9}, 4), "This prints if this assert fails 1 (good for debugging!)" );
    }

    @Test
    public void test_HumanEval_122_EdgeCase() {
        // Check some edge cases that are easy to work out by hand.
        assertEquals(1, addElements(new int[] {1}, 1));
        assertEquals("This prints if this assert fails 2 (also good for debugging!)", "Test passed.");
    }

    public static int addElements(int[] arr, int index) {
        // Implement your logic here
        return 0; // Placeholder for actual implementation
    }
}