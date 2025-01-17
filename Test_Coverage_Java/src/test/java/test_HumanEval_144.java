import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_144Test {

    @Test
    public void test_HumanEval_144() {
        // Check some simple cases
        assertTrue(HumanEval_144.simplify("1/5", "5/1"));
        assertFalse(HumanEval_144.simplify("1/6", "2/1"));
        assertTrue(HumanEval_144.simplify("5/1", "3/1"));
        assertFalse(HumanEval_144.simplify("7/10", "10/2"));
        assertTrue(HumanEval_144.simplify("2/10", "50/10"));
        assertTrue(HumanEval_144.simplify("7/2", "4/2"));
        assertTrue(HumanEval_144.simplify("11/6", "6/1"));
        assertFalse(HumanEval_144.simplify("2/3", "5/2"));
        assertFalse(HumanEval_144.simplify("5/2", "3/5"));
        assertTrue(HumanEval_144.simplify("2/4", "8/4"));

        // Check some edge cases that are easy to work out by hand.
        assertTrue(HumanEval_144.simplify("2/4", "4/2"));
        assertTrue(HumanEval_144.simplify("1/5", "5/1"));
        assertFalse(HumanEval_144.simplify("1/5", "1/5"));
    }

}