import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_130Test {

    @Test
    public void test_HumanEval_130() {
        // Check some simple cases
        assertEquals("[1, 3, 2.0, 8.0]", HumanEval_130.tri(3).toString());
        assertEquals("[1, 3, 2.0, 8.0, 3.0]", HumanEval_130.tri(4).toString());
        assertEquals("[1, 3, 2.0, 8.0, 3.0, 15.0]", HumanEval_130.tri(5).toString());
        assertEquals("[1, 3, 2.0, 8.0, 3.0, 15.0, 4.0]", HumanEval_130.tri(6).toString());
        assertEquals("[1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0]", HumanEval_130.tri(7).toString());
        assertEquals("[1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0, 5.0]", HumanEval_130.tri(8).toString());
        assertEquals("[1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0, 5.0, 35.0]", HumanEval_130.tri(9).toString());
        assertEquals("[1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0, 5.0, 35.0, 6.0, 48.0, 7.0, 63.0, 8.0, 80.0, 9.0, 99.0, 10.0, 120.0, 11.0]", HumanEval_130.tri(20).toString());

        // Check some edge cases that are easy to work out by hand.
        assertEquals("[1]", HumanEval_130.tri(0).toString());
        assertEquals("[1, 3]", HumanEval_130.tri(1).toString());
    }
}