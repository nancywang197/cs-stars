import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class HumanEval_54Test {

    @Test
    public void testSameChars() {
        HumanEval_54 tester = new HumanEval_54();
        assertEquals(true, tester.sameChars("eabcdzzzz", "dddzzzzzzzddeddabc"));
        assertEquals(true, tester.sameChars("abcd", "dddddddabc"));
        assertEquals(true, tester.sameChars("dddddddabc", "abcd"));
        assertEquals(false, tester.sameChars("eabcd", "dddddddabc"));
        assertEquals(false, tester.sameChars("abcd", "dddddddabcf"));
        assertEquals(false, tester.sameChars("eabcdzzzz", "dddzzzzzzzddddabc"));
        assertEquals(false, tester.sameChars("aabb", "aaccc"));
    }
}
