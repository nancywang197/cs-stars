import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class HumanEval_14Test {

    @Test
    public void test_HumanEval_14() {
        String[] expected1 = new String[0];
        String[] result1 = allPrefixes("");
        assertEquals(expected1, result1);

        String[] expected2 = {"a", "as", "asd", "asdf", "asdfg", "asdfgh"};
        String[] result2 = allPrefixes("asdfgh");
        assertArrayEquals(expected2, result2);

        String[] expected3 = {"W", "WW", "WWW"};
        String[] result3 = allPrefixes("WWW");
        assertArrayEquals(expected3, result3);
    }

    // Assuming this function is in the same class
    public static String[] allPrefixes(String str) {
        if (str == null || str.length() == 0) {
            return new String[0];
        }
        String[] prefixes = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                prefixes[i] += str.charAt(j);
            }
        }
        return prefixes;
    }
}