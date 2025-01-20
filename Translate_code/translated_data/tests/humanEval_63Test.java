import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_63Test {

    HumanEval_63 fibfib = new HumanEval_63();

    @Test
    public void testFibfib() {
        assertEquals(1, fibfib.fibfib(2));
        assertEquals(0, fibfib.fibfib(1));
        assertEquals(4, fibfib.fibfib(5));
        assertEquals(24, fibfib.fibfib(8));
        assertEquals(81, fibfib.fibfib(10));
        assertEquals(274, fibfib.fibfib(12));
        assertEquals(927, fibfib.fibfib(14));
    }
}
