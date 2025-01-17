import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval31Test {

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void test_HumanEval_31() {
        assertEquals(false, isPrime(6));
        assertEquals(true, isPrime(101));
        assertEquals(true, isPrime(11));
        assertEquals(true, isPrime(13441));
        assertEquals(true, isPrime(61));
        assertEquals(false, isPrime(4));
        assertEquals(false, isPrime(1));
        assertEquals(true, isPrime(5));
        assertEquals(true, isPrime(17));
        assertEquals(true, isPrime(2)); // added a test case
        assertEquals(false, isPrime(5 * 17));
        assertEquals(false, isPrime(11 * 7));
        assertEquals(false, isPrime(13441 * 19));
    }
}