import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_46Test {

    HumanEval_46 fib4 = new HumanEval_46();

    @Test
    public void testFib4_5() {
        assertEquals(4, fib4.fib4(5));
    }

    @Test
    public void testFib4_8() {
        assertEquals(28, fib4.fib4(8));
    }

    @Test
    public void testFib4_10() {
        assertEquals(104, fib4.fib4(10));
    }

    @Test
    public void testFib4_12() {
        assertEquals(386, fib4.fib4(12));
    }
}
