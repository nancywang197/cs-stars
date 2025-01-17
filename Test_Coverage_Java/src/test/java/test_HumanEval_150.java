import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval_150Test {

    @Test
    public void test_HumanEval_150_SimpleCases() {
        // Check some simple cases
        assertEquals(34, x_or_y(7, 34, 12));
        assertEquals(5, x_or_y(15, 8, 5));
        assertEquals(33, x_or_y(3, 33, 5212));
        assertEquals(3, x_or_y(1259, 3, 52));
        assertEquals(-1, x_or_y(7919, -1, 12));
        assertEquals(583, x_or_y(3609, 1245, 583));
        assertEquals(129, x_or_y(91, 56, 129));
        assertEquals(1234, x_or_y(6, 34, 1234));

        // Check some edge cases that are easy to work out by hand.
        assertEquals(0, x_or_y(1, 2, 0));
        assertEquals(2, x_or_y(2, 2, 0));
    }
}