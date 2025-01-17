import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval149Test {

    @Test
    public void test_HumanEval_149_SimpleCases() {
 
        // Check some simple cases
        assertEquals(new String[]{"aa"}, HumanEval_149.sortedListSum(new String[]{"aa", "a", "aaa"}));
        assertEquals(new String[]{"AI", "asdf", "school"}, HumanEval_149.sortedListSum(new String[]{"school", "AI", "asdf", "b"}));
        assertTrue(HumanEval_149.sortedListSum(new String[]{"d", "b", "c", "a"}) == new String[]{});
        assertEquals(new String[]{"abcd", "dcba"}, HumanEval_149.sortedListSum(new String[]{"d", "dcba", "abcd", "a"}));
 
        // Check some edge cases that are easy to work out by hand.
        assertTrue(HumanEval_149.sortedListSum(new String[]{"AI", "ai", "au"}) == new String[]{"AI", "ai", "au"});
        assertTrue(HumanEval_149.sortedListSum(new String[]{"a", "b", "b", "c", "c", "a"}) == new String[]{});
        assertEquals(new String[]{"cc", "dd", "aaaa", "bbbb"}, HumanEval_149.sortedListSum(new String[]{"aaaa", "bbbb", "dd", "cc"}));
    }
}