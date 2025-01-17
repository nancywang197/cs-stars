import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_12Test {

    @Test
    public void test_HumanEval_12() {
        String longestString = new HumanEval_12().longest(new String[] {});
        assertEquals(null, longestString);

        String[] strings = new String[] {"x", "y", "z"};
        longestString = new HumanEval_12().longest(strings);
        assertEquals("x", longestString);

        strings = new String[] {"x", "yyy", "zzzz", "www", "kkkk", "abc"};
        longestString = new HumanEval_12().longest(strings);
        assertEquals("zzzz", longestString);
    }
}