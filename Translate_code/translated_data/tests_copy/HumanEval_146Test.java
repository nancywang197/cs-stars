package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_146;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_146Test {

    @Test
    public void testSimpleCases() {
        HumanEval_146 instance = new HumanEval_146();
        assertEquals(0, instance.specialFilter(new int[]{5, -2, 1, -5}));
        assertEquals(1, instance.specialFilter(new int[]{15, -73, 14, -15}));
        assertEquals(2, instance.specialFilter(new int[]{33, -2, -3, 45, 21, 109}));
        assertEquals(4, instance.specialFilter(new int[]{43, -12, 93, 125, 121, 109}));
        assertEquals(3, instance.specialFilter(new int[]{71, -2, -33, 75, 21, 19}));
    }

    @Test
    public void testEdgeCases() {
        HumanEval_146 instance = new HumanEval_146();
        assertEquals(0, instance.specialFilter(new int[]{1}));
        assertEquals(0, instance.specialFilter(new int[]{}));
    }
}
