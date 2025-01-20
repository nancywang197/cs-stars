import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_154Test {

    @Test
    public void testCycpatternCheck() {
        HumanEval_154 checker = new HumanEval_154();

        assertFalse("test #0", checker.cycpattern_check("xyzw", "xyw"));
        assertTrue("test #1", checker.cycpattern_check("yello", "ell"));
        assertFalse("test #2", checker.cycpattern_check("whattup", "ptut"));
        assertTrue("test #3", checker.cycpattern_check("efef", "fee"));
        assertFalse("test #4", checker.cycpattern_check("abab", "aabb"));
        assertTrue("test #5", checker.cycpattern_check("winemtt", "tinem"));
    }
}
