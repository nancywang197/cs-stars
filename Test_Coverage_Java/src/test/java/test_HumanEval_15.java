import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval15Test {

    @Test
    public void test_HumanEval_15() {
        String actual = string_sequence(0);
        assertEquals("0", actual);

        String expected = "0 1 2 3";
        actual = string_sequence(3);
        assertEquals(expected, actual);

        expected = "0 1 2 3 4 5 6 7 8 9 10";
        actual = string_sequence(10);
        assertEquals(expected, actual);
    }

    // Define the function in a separate class or method
    public static String string_sequence(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            result.append(i).append(' ');
        }
        return result.toString().trim();
    }
}