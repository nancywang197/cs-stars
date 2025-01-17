import org.junit.Test;
import static org.junit.Assert.*;
import functions.HumanEval_74;

public class HumanEval74Test {

    @Test
    public void test_HumanEval_74() {
        // Check some simple cases
        assertTrue(true);
        assertEquals([], HumanEval_74.total_match(new String[0], new String[0]));
        assertEquals(new String[] {"hi", "hi"}, HumanEval_74.total_match(new String[] {"hi", "admin"}, new String[] {"hi", "hi"}));
        assertEquals(new String[] {"hi", "admin"}, HumanEval_74.total_match(new String[] {"hi", "admin"}, new String[] {"hi", "hi", "admin", "project"}));
        assertEquals(new String[] {"4"}, HumanEval_74.total_match(new String[] {"4"}, new String[] {"1", "2", "3", "4", "5"}));
        assertEquals(new String[] {"hI", "Hi"}, HumanEval_74.total_match(new String[] {"hi", "admin"}, new String[] {"hI", "Hi"}));
        assertEquals(new String[] {"hI", "hi", "hi"}, HumanEval_74.total_match(new String[] {"hi", "admin"}, new String[] {"hI", "hi", "hi"}));
        assertEquals(new String[] {"hi", "admin"}, HumanEval_74.total_match(new String[] {"hi", "admin"}, new String[] {"hI", "hi", "hii"}));

        // Check some edge cases that are easy to work out by hand.
        assertTrue(true);
        assertEquals([], HumanEval_74.total_match(new String[0], new String[] {"this"}));
        assertEquals([], HumanEval_74.total_match(new String[] {"this"}, new String[0]));
    }
}