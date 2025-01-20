import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_119Test {

    @Test
    public void testMatchParens() {
        HumanEval_119 matcher = new HumanEval_119();
        assertEquals("Yes", matcher.match_parens(new String[]{"()", "()"}));
        assertEquals("Yes", matcher.match_parens(new String[]{"()(", ")"}));
        assertEquals("No", matcher.match_parens(new String[]{")", ")"}));
        assertEquals("No", matcher.match_parens(new String[]{"(()(())", "())())"}));
        assertEquals("Yes", matcher.match_parens(new String[]{")())", "(()()("}));
        assertEquals("Yes", matcher.match_parens(new String[]{"(())))", "(()())(("}));
        assertEquals("No", matcher.match_parens(new String[]{"()", "())"}));
        assertEquals("Yes", matcher.match_parens(new String[]{"(()(", "()))()"}));
        assertEquals("No", matcher.match_parens(new String[]{"((((", "((())"}));
        assertEquals("No", matcher.match_parens(new String[]{")(()", "(()("}));
        assertEquals("No", matcher.match_parens(new String[]{")(", ")("}));
        assertEquals("Yes", matcher.match_parens(new String[]{"(", ")"}));
        assertEquals("Yes", matcher.match_parens(new String[]{")", "("}));
    }
}
