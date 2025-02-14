package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_73;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_73Test {

    @Test
    public void testSmallestChange() {
        HumanEval_73 testObj = new HumanEval_73();
        assertEquals(4, testObj.smallest_change(new int[]{1, 2, 3, 5, 4, 7, 9, 6}));
        assertEquals(1, testObj.smallest_change(new int[]{1, 2, 3, 4, 3, 2, 2}));
        assertEquals(1, testObj.smallest_change(new int[]{1, 4, 2}));
        assertEquals(1, testObj.smallest_change(new int[]{1, 4, 4, 2}));
        assertEquals(0, testObj.smallest_change(new int[]{1, 2, 3, 2, 1}));
        assertEquals(0, testObj.smallest_change(new int[]{3, 1, 1, 3}));
        assertEquals(0, testObj.smallest_change(new int[]{1}));
        assertEquals(1, testObj.smallest_change(new int[]{0, 1}));
    }
}
