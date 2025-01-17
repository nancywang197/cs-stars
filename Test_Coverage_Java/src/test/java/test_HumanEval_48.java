import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class HumanEval_48Test {

    @Test
    public void test_HumanEval_48() {
        assertTrue(HumanEval_48.isPalindrome(""));
        assertTrue(HumanEval_48.isPalindrome("aba"));
        assertTrue(HumanEval_48.isPalindrome("aaaaa"));
        assertFalse(HumanEval_48.isPalindrome("zbcd"));
        assertTrue(HumanEval_48.isPalindrome("xywyx"));
        assertFalse(HumanEval_48.isPalindrome("xywyz"));
        assertFalse(HumanEval_48.isPalindrome("xywzx"));
    }
}