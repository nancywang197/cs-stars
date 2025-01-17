import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval24Test {

    @Test
    public void testLargestDivisor() {
        int result = HumanEval_24.largest_divisor(3);
        assertEquals(1, result);

        result = HumanEval_24.largest_divisor(7);
        assertEquals(1, result);

        result = HumanEval_24.largest_divisor(10);
        assertEquals(5, result);

        result = HumanEval_24.largest_divisor(100);
        assertEquals(50, result);

        result = HumanEval_24.largest_divisor(49);
        assertEquals(7, result);
    }
}