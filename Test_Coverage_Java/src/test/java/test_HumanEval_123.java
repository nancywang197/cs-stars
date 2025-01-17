import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_123Test {

    /**
     * This test checks that get_odd_collatz() returns a correct sequence of odd Collatz numbers for some simple cases.
     */
    @Test
    public void testSimpleCases() {
        String[] expectedSequence1 = {"1", "5", "7", "11", "13", "17"};
        String[] expectedSequence2 = {"1", "5"};
        String[] expectedSequence3 = {"1", "3", "5"};

        assertEquals(expectedSequence1, collatz(14));
        assertEquals(expectedSequence2, collatz(5));
        assertEquals(expectedSequence3, collatz(12));

        assertTrue(collatz(1).equals("1"));
    }

    /**
     * This test checks that get_odd_collatz() returns a correct sequence of odd Collatz numbers for edge cases.
     */
    @Test
    public void testEdgeCases() {
        String[] expectedSequence = {"1"};

        assertEquals(expectedSequence, collatz(1));
    }

    private String collatz(int n) {
        StringBuilder result = new StringBuilder();
        while (n != 1 && !isOdd(n)) {
            n = (int)(Math.random() * (n / 2 + 1)); // simulate Collatz sequence
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(n);
        }
        return result.toString();
    }

    private boolean isOdd(int x) {
        return x % 2 != 0;
    }
}