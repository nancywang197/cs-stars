import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class HumanEval109Test {

    @Test
    public void test_HumanEval_109() {
        // Check some simple cases
        assertTrue(HumanEval_109.move_one_ball(new int[]{3, 4, 5, 1, 2}));
        assertTrue(HumanEval_109.move_one_ball(new int[]{3, 5, 10, 1, 2}));
        assertFalse(HumanEval_109.move_one_ball(new int[]{4, 3, 1, 2}));

        // Check some edge cases that are easy to work out by hand.
        assertFalse(HumanEval_109.move_one_ball(new int[]{3, 5, 4, 1, 2}));
        assertTrue(HumanEval_109.move_one_ball(new int[]{}));
    }
}