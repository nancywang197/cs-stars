import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval_111Test {

    @Test
    public void test_HumanEval_111() {
        // Check some simple cases
        assertEquals(2, HumanEval_111.histogram("a b b a"), "This prints if this assertion fails 1 (good for debugging!)");
        assertEquals(2, HumanEval_111.histogram("a b c a b"), "This prints if this assertion fails 2 (good for debugging!)");
        assertEquals(4, HumanEval_111.histogram("a b c d g"), "This prints if this assertion fails 3 (good for debugging!)");
        assertEquals(3, HumanEval_111.histogram("r t g"), "This prints if this assertion fails 4 (good for debugging!)");
        assertEquals(1, HumanEval_111.histogram("b b b b a"), "This prints if this assertion fails 5 (good for debugging!)");
        assertEquals(3, HumanEval_111.histogram("r t g"), "This prints if this assertion fails 6 (good for debugging!)");

        // Check some edge cases that are easy to work out by hand.
        assertEquals(0, HumanEval_111.histogram(""), "This prints if this assertion fails 7 (also good for debugging!)");
        assertEquals(1, HumanEval_111.histogram("a"), "This prints if this assertion fails 8 (also good for debugging!)");
    }
}