import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEvalTest {

    @Test
    public void test_HumanEval_161() {
        // Check some simple cases
        assertEquals("aSdF", solve("AsDf"));
        assertEquals("4321", solve("1234"));
        assertEquals("AB", solve("ab"));
        assertEquals("#A@c", solve("#a@C"));
        assertEquals("#aSDFw^45", solve("#AsdfW^45"));
        assertEquals("2@6#", solve("#6@2"));

        // Check some edge cases that are easy to work out by hand.
        assertEquals("#$A^d", solve("#$a^D"));
        assertEquals("#CCC", solve("#ccc"));
    }

    public String solve(String input) {
        // Your solution here
    }
}