import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval133Test {

    @Test
    public void test_HumanEval_133() {
        // Check some simple cases
        assertEquals(14, sumSquares(new int[] {1,2,3}));
        assertEquals(14, sumSquares(new double[] {1.0,2,3}));  // Note: Java doesn't support mixed data types like Python.
        assertEquals(84, sumSquares(new int[] {1,3,5,7}));
        assertEquals(29, sumSquares(new double[] {1.4,4.2,0}));  
        assertEquals(6, sumSquares(new double[] {-2.4,1,1}));

        assertEquals(10230L, sumSquares(new int[] {100,1,15,2}));  // Note: The return type of the function needs to be declared as long for this assertion.
        assertEquals(200000000L, sumSquares(new int[] {10000,10000}));
        assertEquals(75, sumSquares(new double[] {-1.4,4.6,6.3}));
        assertEquals(1086L, sumSquares(new double[] {-1.4,17.9,18.9,19.9}));

        // Check some edge cases that are easy to work out by hand.
        assertEquals(0, sumSquares(new int[] {0}));
        assertEquals(1, sumSquares(new double[] {-1}));  // Note: The return type of the function needs to be declared as long for this assertion.
        assertEquals(2, sumSquares(new double[] {-1,1,0}));
    }

    public static long sumSquares(int[] array) {
        // Implementation of the sum_squares function
        long result = 0;
        for (int i : array) {
            result += i * i;
        }
        return result;
    }

    public static long sumSquares(double[] array) {
        // Implementation of the sum_squares function
        long result = 0;
        for (double i : array) {
            result += (long)i * i;  // Casting to long to avoid overflow
        }
        return result;
    }
}