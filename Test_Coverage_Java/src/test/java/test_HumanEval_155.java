import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval155Test {

    @Test
    public void test_HumanEval_155() {
 
        // Check some simple cases
        assertEquals((0, 1), evenOddCount(7));
        assertEquals((1, 1), evenOddCount(-78));
        assertEquals((2, 2), evenOddCount(3452));
        assertEquals((3, 3), evenOddCount(346211));
        assertEquals((3, 3), evenOddCount(-345821));
        assertEquals((1, 0), evenOddCount(-2));
        assertEquals((2, 3), evenOddCount(-45347));
        assertEquals((1, 0), evenOddCount(0));
 
 
        // Check some edge cases that are easy to work out by hand.
        assertTrue(true);
    }

    // Assume the following function is defined in a separate class HumanEval155
    public static int[] evenOddCount(int n) {
        int countEven = 0;
        int countOdd = 0;
        while (n != 0) {
            if ((n & 1) == 1) { // If the least significant bit is odd
                countOdd++;
            } else {
                countEven++;
            }
            n >>= 1; // Right shift operation equivalent to dividing by 2
        }
        return new int[]{countEven, countOdd};
    }
}