import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class HumanEval54Test {

    @Test
    public void testSameCharsTrue() {
        boolean result = sameChars("eabcdzzzz", "dddzzzzzzzddeddabc");
        assertTrue(result);
    }

    @Test
    public void testSameCharsTrue2() {
        boolean result = sameChars("abcd", "dddddddabc");
        assertTrue(result);
    }

    @Test
    public void testSameCharsTrue3() {
        boolean result = sameChars("dddddddabc", "abcd");
        assertTrue(result);
    }

    @Test
    public void testSameCharsFalse1() {
        boolean result = sameChars("eabcd", "dddddddabc");
        assertFalse(result);
    }

    @Test
    public void testSameCharsFalse2() {
        boolean result = sameChars("abcd", "dddddddabcf");
        assertFalse(result);
    }

    @Test
    public void testSameCharsFalse3() {
        boolean result = sameChars("eabcdzzzz", "dddzzzzzzzddddabc");
        assertFalse(result);
    }

    @Test
    public void testSameCharsFalse4() {
        boolean result = sameChars("aabb", "aaccc");
        assertFalse(result);
    }
}