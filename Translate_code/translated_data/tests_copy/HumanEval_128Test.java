package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_128;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_128Test {

    @Test
    public void testProdSigns() {
        HumanEval_128 tester = new HumanEval_128();
        assertEquals(-9, tester.prod_signs(new int[]{1, 2, 2, -4}));
        assertEquals(0, tester.prod_signs(new int[]{0, 1}));
        assertEquals(-10, tester.prod_signs(new int[]{1, 1, 1, 2, 3, -1, 1}));
        assertEquals(0, tester.prod_signs(new int[]{}));
        assertEquals(20, tester.prod_signs(new int[]{2, 4, 1, 2, -1, -1, 9}));
        assertEquals(4, tester.prod_signs(new int[]{-1, 1, -1, 1}));
        assertEquals(-4, tester.prod_signs(new int[]{-1, 1, 1, 1}));
        assertEquals(0, tester.prod_signs(new int[]{-1, 1, 1, 0}));
    }
}
