import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval_135Test {

    @Test
    public void testHumanEval_135_SimpleCases() {
        // Check some simple cases
        assertEquals(3, canArrange(new int[] {1, 2, 4, 3, 5}));
        assertEquals(-1, canArrange(new int[] {1, 2, 4, 5}));
        assertEquals(2, canArrange(new int[] {1, 4, 2, 5, 6, 7, 8, 9, 10}));
        assertEquals(4, canArrange(new int[] {4, 8, 5, 7, 3}));

        // Check some edge cases that are easy to work out by hand.
        assertEquals(-1, canArrange(new int[0]));
    }

    public static int canArrange(int[] arr) {
        // Your implementation of the function goes here
        return -1; // Replace with your actual logic
    }
}