import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval_97Test {

    @Test
    public void test_HumanEval_97() {
        // Check some simple cases
        assertEquals(16, multiply(148, 412), "First test error: Expected = 16, Actual = " + multiply(148, 412));
        assertEquals(72, multiply(19, 28), "Second test error: Expected = 72, Actual = " + multiply(19, 28));
        assertEquals(0, multiply(2020, 1851), "Third test error: Expected = 0, Actual = " + multiply(2020, 1851));
        assertEquals(20, multiply(14, -15), "Fourth test error: Expected = 20, Actual = " + multiply(14, -15));
        assertEquals(42, multiply(76, 67), "Fifth test error: Expected = 42, Actual = " + multiply(76, 67));
        assertEquals(49, multiply(17, 27), "Sixth test error: Expected = 49, Actual = " + multiply(17, 27));

        // Check some edge cases that are easy to work out by hand.
        assertEquals(0, multiply(0, 1), "1st edge test error: Expected = 0, Actual = " + multiply(0, 1));
        assertEquals(0, multiply(0, 0), "2nd edge test error: Expected = 0, Actual = " + multiply(0, 0));
    }

    // Define the function being tested
    public int multiply(int a, int b) {
        return a * b;
    }
}