import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval76Test {

    @Test
    public void test_HumanEval_76() {
 
        // Check some simple cases
        assertTrue(HumanEval_76.isSimplePower(16, 2));
        assertFalse(HumanEval_76.isSimplePower(143214, 16));
        assertTrue(HumanEval_76.isSimplePower(4, 2));
        assertTrue(HumanEval_76.isSimplePower(9, 3));
        assertTrue(HumanEval_76.isSimplePower(16, 4));
        assertFalse(HumanEval_76.isSimplePower(24, 2));
        assertFalse(HumanEval_76.isSimplePower(128, 4));
        assertFalse(HumanEval_76.isSimplePower(12, 6));
 
        // Check some edge cases that are easy to work out by hand.
        assertTrue(HumanEval_76.isSimplePower(1, 1));
        assertTrue(HumanEval_76.isSimplePower(1, 12));
    }
}