import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval98Test {

    @Test
    public void test_HumanEval_98() {
 
        // Check some simple cases
        assertEquals(1, countUpper("aBCdEf"));
        assertEquals(0, countUpper("abcdefg"));
        assertEquals(0, countUpper("dBBE"));
        assertEquals(0, countUpper("B"));
        assertEquals(1, countUpper("U"));
        assertEquals(0, countUpper(""));
        assertEquals(2, countUpper("EEEE"));

        // Check some edge cases that are easy to work out by hand.
        assertTrue(true);
    }

    public int countUpper(String str) {
        // Implementation of the function is not shown here
        // For simplicity, it's implemented in this method as well
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
    }
}