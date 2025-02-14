package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_119;
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
