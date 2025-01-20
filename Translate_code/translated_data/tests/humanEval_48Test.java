import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_48Test {

    HumanEval_48 palindromeChecker = new HumanEval_48();

    @Test
    public void testEmpty() {
        assertEquals(true, palindromeChecker.is_palindrome(""));
    }

    @Test
    public void testAba() {
        assertEquals(true, palindromeChecker.is_palindrome("aba"));
    }

    @Test
    public void testAaaaa() {
        assertEquals(true, palindromeChecker.is_palindrome("aaaaa"));
    }

    @Test
    public void testZbcd() {
        assertEquals(false, palindromeChecker.is_palindrome("zbcd"));
    }

    @Test
    public void testXywyx() {
        assertEquals(true, palindromeChecker.is_palindrome("xywyx"));
    }

    @Test
    public void testXywyz() {
        assertEquals(false, palindromeChecker.is_palindrome("xywyz"));
    }

    @Test
    public void testXywzx() {
        assertEquals(false, palindromeChecker.is_palindrome("xywzx"));
    }
}
