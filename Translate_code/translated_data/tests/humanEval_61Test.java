import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_61Test {

    HumanEval_61 humanEval_61 = new HumanEval_61();

    @Test
    public void testCorrectBracketing() {
        assertTrue(humanEval_61.correct_bracketing("()"));
        assertTrue(humanEval_61.correct_bracketing("(()())"));
        assertTrue(humanEval_61.correct_bracketing("()()(()())()"));
        assertTrue(humanEval_61.correct_bracketing("()()((()()())())(()()(()))"));
        assertFalse(humanEval_61.correct_bracketing("((()())))"));
        assertFalse(humanEval_61.correct_bracketing(")(()"));
        assertFalse(humanEval_61.correct_bracketing("("));
        assertFalse(humanEval_61.correct_bracketing("(((("));
        assertFalse(humanEval_61.correct_bracketing(")"));
        assertFalse(humanEval_61.correct_bracketing("(()"));
        assertFalse(humanEval_61.correct_bracketing("()()(()())())(()"));
        assertFalse(humanEval_61.correct_bracketing("()()(()())()))()"));
    }
}
