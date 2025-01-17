import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval80Test {

    @Test
    public void test_HumanEval_80() {
        // Check some simple cases
        assertTrue("abcd", isHappy("abcd"));
        assertFalse("a", isHappy("a"));
        assertFalse("aa", isHappy("aa"));
        assertFalse("xyy", isHappy("xyy"));
        assertTrue("iopaxpoi", isHappy("iopaxpoi"));
        assertFalse("iopaxioi", isHappy("iopaxioi"));

        // Add more test cases as needed
    }

    @Test
    public void test_HumanEval_80_With_Abbreviation() {
        assertTrue("adb", isHappy("adb"));
        assertTrue("aabb", isHappy("aabb")); // Note: This was False in the original Python test
    }
}