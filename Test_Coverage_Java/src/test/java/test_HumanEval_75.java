import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval75Test {

    @Test
    public void testIsMultiplyPrime_5ReturnsFalse() {
        boolean result = isMultiplyPrime(5);
        assertEquals(false, result);
    }

    @Test
    public void testIsMultiplyPrime_30ReturnsTrue() {
        boolean result = isMultiplyPrime(30);
        assertEquals(true, result);
    }

    @Test
    public void testIsMultiplyPrime_8ReturnsTrue() {
        boolean result = isMultiplyPrime(8);
        assertEquals(true, result);
    }

    @Test
    public void testIsMultiplyPrime_10ReturnsFalse() {
        boolean result = isMultiplyPrime(10);
        assertEquals(false, result);
    }

    @Test
    public void testIsMultiplyPrime_125ReturnsTrue() {
        boolean result = isMultiplyPrime(125);
        assertEquals(true, result);
    }

    @Test
    public void testIsMultiplyPrime_MultiplePrimesReturnsTrue() {
        boolean result = isMultiplyPrime(3 * 5 * 7);
        assertEquals(true, result);
    }

    @Test
    public void testIsMultiplyPrime_MixedNumbersReturnsFalse() {
        boolean result = isMultiplyPrime(3 * 6 * 7);
        assertEquals(false, result);
    }

    @Test
    public void testIsMultiplyPrime_CubeOfNumberReturnsFalse() {
        boolean result = isMultiplyPrime(9 * 9 * 9);
        assertEquals(false, result);
    }

    @Test
    public void testIsMultiplyPrime_DifferentPrimeNumbersReturnsTrue() {
        boolean result = isMultiplyPrime(11 * 13 * 7);
        assertEquals(true, result);
    }
}