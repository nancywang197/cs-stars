import org.junit.Test;
import org.junit.Assert;
import java.util.Arrays;
import java.util.List;

public class HumanEval_6Test {

    @Test
    public void testParseNestedParens1() {
        HumanEval_6 parser = new HumanEval_6();
        List<Integer> expected = Arrays.asList(2, 3, 1, 3);
        List<Integer> actual = parser.parse_nested_parens("(()()) ((())) () ((())()())");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testParseNestedParens2() {
        HumanEval_6 parser = new HumanEval_6();
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        List<Integer> actual = parser.parse_nested_parens("() (()) ((())) (((())))");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testParseNestedParens3() {
        HumanEval_6 parser = new HumanEval_6();
        List<Integer> expected = Arrays.asList(4);
        List<Integer> actual = parser.parse_nested_parens("(()(())((())))");
        Assert.assertEquals(expected, actual);
    }
}
