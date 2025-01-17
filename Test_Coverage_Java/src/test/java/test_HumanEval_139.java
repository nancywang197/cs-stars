import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval_139Test {

    @Test
    public void test_HumanEval_139() {
        // Check some simple cases
        assertEquals(288, specialFactorial(4), "Test 4");
        assertEquals(34560, specialFactorial(5), "Test 5");
        assertEquals(125411328000L, specialFactorial(7), "Test 7");

        // Check some edge cases that are easy to work out by hand.
        assertEquals(1L, specialFactorial(1), "Test 1");
    }

    // Note: This class should contain the implementation of special_factorial method
}