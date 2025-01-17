import org.junit.Test;
import static org.junit.Assert.*;
import functions.HumanEval_83;

public class HumanEval_83Test {

    @Test
    public void test_HumanEval_83() {
        // Check some simple cases
        assertTrue(true, "This prints if this assertion fails 1 (good for debugging!)");
        assertEquals(1, HumanEval_83.starts_one_ends(1));
        assertEquals(18, HumanEval_83.starts_one_ends(2));
        assertEquals(180, HumanEval_83.starts_one_ends(3));
        assertEquals(1800, HumanEval_83.starts_one_ends(4));
        assertEquals(18000, HumanEval_83.starts_one_ends(5));

        // Check some edge cases that are easy to work out by hand.
        assertTrue(true, "This prints if this assertion fails 2 (also good for debugging!)");
    }
}