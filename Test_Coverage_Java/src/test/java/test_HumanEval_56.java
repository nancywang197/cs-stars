import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval56Test {

    @Test
    public void test_HumanEval_56() {
        assertTrue(HumanEval_56.correctBracketing("<>"));
        assertTrue(HumanEval_56.correctBracketing("<<><>>"));
        assertTrue(HumanEval_56.correctBracketing("<><><<><>><>"));

        assertFalse(HumanEval_56.correctBracketing("<<<><>>>>"));
        assertFalse(HumanEval_56.correctBracketing("><<>"));
        assertFalse(HumanEval_56.correctBracketing("<"));
        assertFalse(HumanEval_56.correctBracketing("<<<<"));
        assertFalse(HumanEval_56.correctBracketing(">"));
        assertFalse(HumanEval_56.correctBracketing("<<>"));
        assertFalse(HumanEval_56.correctBracketing("<><><<><>><>><<>"));
        assertFalse(HumanEval_56.correctBracketing("<><><<><>><>>><>"));
    }
}