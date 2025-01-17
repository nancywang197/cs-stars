import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_39Test {

    @Test
    public void test_HumanEval_39() {
        assertEquals(2, HumanEval_39.prime_fib(1));
        assertEquals(3, HumanEval_39.prime_fib(2));
        assertEquals(5, HumanEval_39.prime_fib(3));
        assertEquals(13, HumanEval_39.prime_fib(4));
        assertEquals(89, HumanEval_39.prime_fib(5));
        assertEquals(233, HumanEval_39.prime_fib(6));
        assertEquals(1597, HumanEval_39.prime_fib(7));
        assertEquals(28657, HumanEval_39.prime_fib(8));
        assertEquals(514229, HumanEval_39.prime_fib(9));
        assertEquals(433494437, HumanEval_39.prime_fib(10));
    }
}