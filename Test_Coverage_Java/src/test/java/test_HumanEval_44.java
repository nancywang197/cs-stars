import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval44Test {

    @Test
    public void test_HumanEval_44() {
        // Test cases for base 3
        assertEquals("22", changeBase(8, 3));
        assertEquals("100", changeBase(9, 3));

        // Test cases for base 2
        assertEquals("11101010", changeBase(234, 2));
        assertEquals("10000", changeBase(16, 2));
        assertEquals("1000", changeBase(8, 2));
        assertEquals("111", changeBase(7, 2));

        // Test cases for unknown bases (x) where x is in the range [2, 8]
        for (int i = 2; i < 8; i++) {
            assertEquals(String.valueOf(i), changeBase(i, i + 1));
        }
    }

    public static String changeBase(int num, int base) {
        // Convert number to string using specified base
        return Integer.toString(num, base);
    }
}