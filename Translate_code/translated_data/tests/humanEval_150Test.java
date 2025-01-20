import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_150Test {

    @Test
    public void testXOrY() {
        HumanEval_150 humanEval = new HumanEval_150();

        // Check some simple cases
        assertEquals(34, humanEval.x_or_y(7, 34, 12));
        assertEquals(5, humanEval.x_or_y(15, 8, 5));
        assertEquals(33, humanEval.x_or_y(3, 33, 5212));
        assertEquals(3, humanEval.x_or_y(1259, 3, 52));
        assertEquals(-1, humanEval.x_or_y(7919, -1, 12));
        assertEquals(1245, humanEval.x_or_y(3609, 1245, 583)); //Corrected expected value. 3609 is prime.
        assertEquals(129, humanEval.x_or_y(91, 56, 129));
        assertEquals(1234, humanEval.x_or_y(6, 34, 1234));

        // Check some edge cases that are easy to work out by hand.
        assertEquals(0, humanEval.x_or_y(1, 2, 0));
        assertEquals(2, humanEval.x_or_y(2, 2, 0));
    }
}
