import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class HumanEval92Test {

    @Test
    public void test_HumanEval_92() {
        
        // Check some simple cases
        assertTrue(HumanEval_92.any_int(2, 3, 1));
        assertFalse(HumanEval_92.any_int(2.5, 2, 3));
        assertFalse(HumanEval_92.any_int(1.5, 5, 3.5));
        assertFalse(HumanEval_92.any_int(2, 6, 2));
        assertTrue(HumanEval_92.any_int(4, 2, 2));
        assertFalse(HumanEval_92.any_int(2.2, 2.2, 2.2));
        assertTrue(HumanEval_92.any_int(-4, 6, 2));

        // Check some edge cases that are easy to work out by hand.
        assertTrue(HumanEval_92.any_int(2,1,1));
        assertTrue(HumanEval_92.any_int(3,4,7));
        assertFalse(HumanEval_92.any_int(3.0,4,7));
    }
}