import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class HumanEval43Test {

    @Test
    public void testPairsSumToZero_False_WhenNoPairIsSummingToZero() {
        boolean result = HumanEval_43.pairs_sum_to_zero(new int[]{1, 3, 5, 0});
        assertFalse(result);
    }

    @Test
    public void testPairsSumToZero_False_WhenNoValidPairFound() {
        boolean result = HumanEval_43.pairs_sum_to_zero(new int[]{1, 2, 3, 7});
        assertFalse(result);
    }

    @Test
    public void testPairsSumToZero_True_WhenAllNumbersAreSummingToZero() {
        boolean result = HumanEval_43.pairs_sum_to_zero(new int[]{2, 4, -5, 3, 5, 7});
        assertTrue(result);
    }

    @Test
    public void testPairsSumToZero_False_WhenSingleElementArrayIsPassed() {
        boolean result = HumanEval_43.pairs_sum_to_zero(new int[]{1});
        assertFalse(result);
    }

    @Test
    public void testPairsSumToZero_True_WhenNumbersAreSummingToZero() {
        boolean result = HumanEval_43.pairs_sum_to_zero(new int[]{-3, 9, -1, 3, 2, 30});
        assertTrue(result);
    }

    @Test
    public void testPairsSumToZero_False_WhenNoValidPairFound() {
        boolean result = HumanEval_43.pairs_sum_to_zero(new int[]{-3, 9, -1, 4, 2, 31});
        assertFalse(result);
    }
}