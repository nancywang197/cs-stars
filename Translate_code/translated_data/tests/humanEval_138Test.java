import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_138Test {
    HumanEval_138 func = new HumanEval_138();

    @Test
    public void test1() {
        assertEquals(false, func.is_equal_to_sum_even(4));
    }

    @Test
    public void test2() {
        assertEquals(false, func.is_equal_to_sum_even(6));
    }

    @Test
    public void test3() {
        assertEquals(true, func.is_equal_to_sum_even(8));
    }

    @Test
    public void test4() {
        assertEquals(true, func.is_equal_to_sum_even(10));
    }

    @Test
    public void test5() {
        assertEquals(false, func.is_equal_to_sum_even(11));
    }

    @Test
    public void test6() {
        assertEquals(true, func.is_equal_to_sum_even(12));
    }

    @Test
    public void test7() {
        assertEquals(false, func.is_equal_to_sum_even(13));
    }

    @Test
    public void test8() {
        assertEquals(true, func.is_equal_to_sum_even(16));
    }
}
