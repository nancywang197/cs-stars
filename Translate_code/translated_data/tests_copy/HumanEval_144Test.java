package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_144;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_144Test {

    @Test
    public void testSimplify() {
        HumanEval_144 simplifier = new HumanEval_144();

        // Check some simple cases
        assertTrue("test1", simplifier.simplify("1/5", "5/1"));
        assertFalse("test2", simplifier.simplify("1/6", "2/1"));
        assertTrue("test3", simplifier.simplify("5/1", "3/1"));
        assertFalse("test4", simplifier.simplify("7/10", "10/2"));
        assertTrue("test5", simplifier.simplify("2/10", "50/10"));
        assertTrue("test6", simplifier.simplify("7/2", "4/2"));
        assertTrue("test7", simplifier.simplify("11/6", "6/1"));
        assertFalse("test8", simplifier.simplify("2/3", "5/2"));
        assertFalse("test9", simplifier.simplify("5/2", "3/5"));
        assertTrue("test10", simplifier.simplify("2/4", "8/4"));

        // Check some edge cases that are easy to work out by hand.
        assertTrue("test11", simplifier.simplify("2/4", "4/2"));
        assertTrue("test12", simplifier.simplify("1/5", "5/1"));
        assertFalse("test13", simplifier.simplify("1/5", "1/5"));
    }
}
