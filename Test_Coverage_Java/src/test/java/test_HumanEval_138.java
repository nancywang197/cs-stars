import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_138Test {

    @Test
    public void test_HumanEval_138() {
        assertFalse(HumanEval_138.is_equal_to_sum_even(4));
        assertFalse(HumanEval_138.is_equal_to_sum_even(6));
        assertTrue(HumanEval_138.is_equal_to_sum_even(8));
        assertTrue(HumanEval_138.is_equal_to_sum_even(10));
        assertFalse(HumanEval_138.is_equal_to_sum_even(11));
        assertTrue(HumanEval_138.is_equal_to_sum_even(12));
        assertFalse(HumanEval_138.is_equal_to_sum_even(13));
        assertTrue(HumanEval_138.is_equal_to_sum_even(16));
    }
}