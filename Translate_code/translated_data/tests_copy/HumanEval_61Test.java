package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_61;
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
