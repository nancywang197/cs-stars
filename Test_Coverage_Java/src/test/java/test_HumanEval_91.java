import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval91Test {

    @Test
    public void test_HumanEval_91() {
        // Check some simple cases
        assertEquals(0, HumanEval_91.isBored("Hello world"), "Test 1");
        assertEquals(0, HumanEval_91.isBored("Is the sky blue?"), "Test 2");
        assertEquals(1, HumanEval_91.isBored("I love It !"), "Test 3");
        assertEquals(0, HumanEval_91.isBored("bIt"), "Test 4");
        assertEquals(2, HumanEval_91.isBored("I feel good today. I will be productive. will kill It"), "Test 5");
        assertEquals(0, HumanEval_91.isBored("You and I are going for a walk"), "Test 6");

        // Check some edge cases that are easy to work out by hand.
        assertTrue(true, "This prints if this assert fails!");
    }
}