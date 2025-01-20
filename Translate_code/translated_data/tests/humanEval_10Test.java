import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_10Test {

    private final HumanEval_10 humanEval_10 = new HumanEval_10();

    @Test
    public void testMakePalindromeEmpty() {
        assertEquals("", humanEval_10.makePalindrome(""));
    }

    @Test
    public void testMakePalindromeSingleChar() {
        assertEquals("x", humanEval_10.makePalindrome("x"));
    }

    @Test
    public void testMakePalindromeMultipleChars() {
        assertEquals("xyzyx", humanEval_10.makePalindrome("xyz"));
    }

    @Test
    public void testMakePalindromeAlreadyPalindrome() {
        assertEquals("xyx", humanEval_10.makePalindrome("xyx"));
    }

    @Test
    public void testMakePalindromeWord() {
        assertEquals("jerryrrej", humanEval_10.makePalindrome("jerry"));
    }
}
