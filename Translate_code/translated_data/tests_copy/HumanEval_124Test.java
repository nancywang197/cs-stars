package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_124;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_124Test {

    HumanEval_124 validDateTester = new HumanEval_124();

    @Test
    public void testValidDate() {
        assertEquals(true, validDateTester.validDate("03-11-2000"));
        assertEquals(false, validDateTester.validDate("15-01-2012"));
        assertEquals(false, validDateTester.validDate("04-0-2040"));
        assertEquals(true, validDateTester.validDate("06-04-2020"));
        assertEquals(true, validDateTester.validDate("01-01-2007"));
        assertEquals(false, validDateTester.validDate("03-32-2011"));
        assertEquals(false, validDateTester.validDate(""));
        assertEquals(false, validDateTester.validDate("04-31-3000"));
        assertEquals(true, validDateTester.validDate("06-06-2005"));
        assertEquals(false, validDateTester.validDate("21-31-2000"));
        assertEquals(true, validDateTester.validDate("04-12-2003"));
        assertEquals(false, validDateTester.validDate("04122003"));
        assertEquals(false, validDateTester.validDate("20030412"));
        assertEquals(false, validDateTester.validDate("2003-04"));
        assertEquals(false, validDateTester.validDate("2003-04-12"));
        assertEquals(false, validDateTester.validDate("04-2003"));
    }
}
