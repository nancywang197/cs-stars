import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_124Test {

    private HumanEval_124 humanEval = new HumanEval_124();

    @Test
    public void testValidDate_SimpleCases() {
        assertTrue(humanEval.validDate("03-11-2000"));
        assertFalse(humanEval.validDate("15-01-2012"));
        assertFalse(humanEval.validDate("04-0-2040"));
        assertTrue(humanEval.validDate("06-04-2020"));
        assertTrue(humanEval.validDate("01-01-2007"));
        assertFalse(humanEval.validDate("03-32-2011"));
        assertFalse(humanEval.validDate(""));
        assertFalse(humanEval.validDate("04-31-3000"));
        assertTrue(humanEval.validDate("06-06-2005"));
        assertFalse(humanEval.validDate("21-31-2000"));
        assertTrue(humanEval.validDate("04-12-2003"));
        assertFalse(humanEval.validDate("04122003"));
        assertFalse(humanEval.validDate("20030412"));
        assertFalse(humanEval.validDate("2003-04"));
        assertFalse(humanEval.validDate("2003-04-12"));
        assertFalse(humanEval.validDate("04-2003"));
    }

}