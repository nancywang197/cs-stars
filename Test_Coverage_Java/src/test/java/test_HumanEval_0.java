import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class HumanEval_0Test {

    @Test
    public void test_HumanEval_0_Tolerance_3() {
        assertTrue(HumanEval_0.hasCloseElements([1.0, 2.0, 3.9, 4.0, 5.0, 2.2], 0.3));
    }

    @Test
    public void test_HumanEval_0_Tolerance_05() {
        assertFalse(HumanEval_0.hasCloseElements([1.0, 2.0, 3.9, 4.0, 5.0, 2.2], 0.05));
    }

    @Test
    public void test_HumanEval_0_Tolerance_95() {
        assertTrue(HumanEval_0.hasCloseElements([1.0, 2.0, 5.9, 4.0, 5.0], 0.95));
    }

    @Test
    public void test_HumanEval_0_Tolerance_8() {
        assertFalse(HumanEval_0.hasCloseElements([1.0, 2.0, 5.9, 4.0, 5.0], 0.8));
    }

    @Test
    public void test_HumanEval_0_Tolerance_1() {
        assertTrue(HumanEval_0.hasCloseElements([1.0, 2.0, 3.0, 4.0, 5.0, 2.0], 0.1));
    }

    @Test
    public void test_HumanEval_0_Tolerance Equal() {
        assertTrue(HumanEval_0.hasCloseElements([1.1, 2.2, 3.1, 4.1, 5.1], 1.0));
    }

    @Test
    public void test_HumanEval_0_Tolerance_LargerThanTolerance() {
        assertFalse(HumanEval_0.hasCloseElements([1.1, 2.2, 3.1, 4.1, 5.1], 0.5));
    }
}