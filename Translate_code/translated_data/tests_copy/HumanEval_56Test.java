package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_56;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_56Test {

    HumanEval_56 checker = new HumanEval_56();

    @Test
    public void testCorrectBracketing() {
        assertTrue(checker.correct_bracketing("<>"));
        assertTrue(checker.correct_bracketing("<<><>>"));
        assertTrue(checker.correct_bracketing("<><><<><>><>"));
        assertTrue(checker.correct_bracketing("<><><<<><><>><>><<><><<>>>"));
        assertFalse(checker.correct_bracketing("<<<><>>>>"));
        assertFalse(checker.correct_bracketing("><<>"));
        assertFalse(checker.correct_bracketing("<"));
        assertFalse(checker.correct_bracketing("<<<<"));
        assertFalse(checker.correct_bracketing(">"));
        assertFalse(checker.correct_bracketing("<<>"));
        assertFalse(checker.correct_bracketing("<><><<><>><>><<>"));
        assertFalse(checker.correct_bracketing("<><><<><>><>>><>"));
    }
}
