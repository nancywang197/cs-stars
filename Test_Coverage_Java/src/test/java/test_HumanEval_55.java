import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval55Test {

    @Test
    public void test_HumanEval_55() {
        assertEquals(55, fib(10));
        assertEquals(1, fib(1));
        assertEquals(21, fib(8));
        assertEquals(89, fib(11));
        assertEquals(144, fib(12));
    }

    // This method should be moved to a separate class or file
    public static int fib(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}