import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval63Test {

    @Test
    public void test_FibonacciFunction() {
        assertEquals(1, HumanEval_63.fibfib(2));
        assertEquals(0, HumanEval_63.fibfib(1));
        assertEquals(4, HumanEval_63.fibfib(5));
        assertEquals(24, HumanEval_63.fibfib(8));
        assertEquals(81, HumanEval_63.fibfib(10));
        assertEquals(274, HumanEval_63.fibfib(12));
        assertEquals(927, HumanEval_63.fibfib(14));
    }
}