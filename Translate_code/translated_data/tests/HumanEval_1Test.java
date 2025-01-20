import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;
import java.util.Arrays;


public class HumanEval_1Test {

    @Test
    public void testSeparateParenGroups1() {
        HumanEval_1 humanEval = new HumanEval_1();
        List<String> expected = Arrays.asList("(()())", "((()))", "()", "((())()())");
        List<String> actual = humanEval.separate_paren_groups("(()()) ((())) () ((())()())");
        assertEquals(expected, actual);
    }

    @Test
    public void testSeparateParenGroups2() {
        HumanEval_1 humanEval = new HumanEval_1();
        List<String> expected = Arrays.asList("()", "(())", "((()))", "(((())))");
        List<String> actual = humanEval.separate_paren_groups("() (()) ((())) (((())))");
        assertEquals(expected, actual);
    }

    @Test
    public void testSeparateParenGroups3() {
        HumanEval_1 humanEval = new HumanEval_1();
        List<String> expected = Arrays.asList("(()(())((())))");
        List<String> actual = humanEval.separate_paren_groups("(()(())((())))");
        assertEquals(expected, actual);
    }

    @Test
    public void testSeparateParenGroups4() {
        HumanEval_1 humanEval = new HumanEval_1();
        List<String> expected = Arrays.asList("()", "(())", "(()())"); //Corrected expected output
        List<String> actual = humanEval.separate_paren_groups("( ) (( )) (( )( ))");
        assertEquals(expected, actual);
    }
}
