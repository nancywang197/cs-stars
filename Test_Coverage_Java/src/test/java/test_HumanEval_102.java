import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_102Test {

    @Test
    public void test_HumanEval_102() {
 
        // Check some simple cases
        assertEquals(14, chooseNum(12, 15));
        assertEquals(-1, chooseNum(13, 12));
        assertEquals(12354, chooseNum(33, 12354));
        assertEquals(-1, chooseNum(5234, 5233));
        assertEquals(28, chooseNum(6, 29));
        assertEquals(-1, chooseNum(27, 10));
 
        // Check some edge cases that are easy to work out by hand.
        assertEquals(-1, chooseNum(7, 7));
        assertEquals(546, chooseNum(546, 546));
 

    }

    public int chooseNum(int a, int b) {
        if (a > b) {
            return b;
        } else if (a < b) {
            return -1; // No valid choice
        } else { // a == b
            return a;
        }
    }
}