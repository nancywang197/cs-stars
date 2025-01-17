import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_13Test {

    @Test
    public void testGreatestCommonDivisor() {
        assertEquals(1, functions.HumanEval_13.greatest_common_divisor(3, 7));
        assertEquals(5, functions.HumanEval_13.greatest_common_divisor(10, 15));
        assertEquals(7, functions.HumanEval_13.greatest_common_divisor(49, 14));
        assertEquals(12, functions.HumanEval_13.greatest_common_divisor(144, 60));
    }
}