import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HumanEval61Test {

    @Test
    public void test_HumanEval_61() {
        assertTrue(HumanEval_61.correct_bracketing("("));
        assertTrue(HumanEval_61.correct_bracketing("(("));
        assertTrue(HumanEval_61.correct_bracketing("(())"));
        assertTrue(HumanEval_61.correct_bracketing("(()())"));

        assertFalse(HumanEval_61.correct_bracketing(")((()))");
        assertFalse(HumanEval_61.correct_bracketing(")(("));
        assertFalse(HumanEval_61.correct_bracketing("("));
        assertFalse(HumanEval_61.correct_bracketing("(("));
        assertFalse(HumanEval_61.correct_bracketing(")("));
        assertFalse(HumanEval_61.correct_bracketing("(()"));
        assertFalse(HumanEval_61.correct_bracketing("()()(()())())(()"));
    }
}