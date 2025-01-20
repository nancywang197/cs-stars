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
