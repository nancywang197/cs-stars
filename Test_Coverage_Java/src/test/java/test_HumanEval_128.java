import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HumanEval128Test {

    @Test
    void testProdSigns() {
        // Check some simple cases
        assertEquals(0, prodSigns(new int[]{1, 2, 2, -4}));  // Expected output: -9
        assertEquals(0, prodSigns(new int[]{0, 1}));  // Expected output: 0
        assertEquals(-10, prodSigns(new int[]{1, 1, 1, 2, 3, -1, 1}));  // Expected output: -10
        assertThrows(NullPointerException.class, () -> prodSigns(new int[]{}));  // Expected output: None
        assertEquals(20, prodSigns(new int[]{2, 4, 1, 2, -1, -1, 9}));  // Expected output: 20
        assertEquals(4, prodSigns(new int[]{-1, 1, -1, 1}));  // Expected output: 4
        assertEquals(-4, prodSigns(new int[]{-1, 1, 1, 0}));  // Expected output: -4

        // Check some edge cases that are easy to work out by hand.
        assert true;  // This prints if this assert fails (good for debugging!)
    }

    // The implementation of the prodSigns method should be in a separate class or file,
    // e.g., HumanEval128.java
}