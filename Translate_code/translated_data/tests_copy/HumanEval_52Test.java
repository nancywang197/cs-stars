package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_52;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_52Test {

    @Test
    public void testBelowThreshold() {
        HumanEval_52 testObj = new HumanEval_52();
        assertTrue(testObj.below_threshold(new int[]{1, 2, 4, 10}, 100));
        assertFalse(testObj.below_threshold(new int[]{1, 20, 4, 10}, 5));
        assertTrue(testObj.below_threshold(new int[]{1, 20, 4, 10}, 21));
        assertTrue(testObj.below_threshold(new int[]{1, 20, 4, 10}, 22));
        assertTrue(testObj.below_threshold(new int[]{1, 8, 4, 10}, 11));
        assertFalse(testObj.below_threshold(new int[]{1, 8, 4, 10}, 10));
    }
}
