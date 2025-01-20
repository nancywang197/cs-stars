import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_55Test {

    HumanEval_55 fibCalculator = new HumanEval_55();

    @Test
    public void testFib10() {
        assertEquals(55, fibCalculator.fib(10));
    }

    @Test
    public void testFib1() {
        assertEquals(1, fibCalculator.fib(1));
    }

    @Test
    public void testFib8() {
        assertEquals(21, fibCalculator.fib(8));
    }

    @Test
    public void testFib11() {
        assertEquals(89, fibCalculator.fib(11));
    }

    @Test
    public void testFib12() {
        assertEquals(144, fibCalculator.fib(12));
    }
}
