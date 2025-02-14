package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_155;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class HumanEval_155Test {

    @Test
    public void testEvenOddCount() {
        HumanEval_155 instance = new HumanEval_155();

        // Check some simple cases
        assertArrayEquals(new int[]{0, 1}, instance.even_odd_count(7));
        assertArrayEquals(new int[]{1, 1}, instance.even_odd_count(-78));
        assertArrayEquals(new int[]{2, 2}, instance.even_odd_count(3452));
        assertArrayEquals(new int[]{3, 3}, instance.even_odd_count(346211));
        assertArrayEquals(new int[]{3, 3}, instance.even_odd_count(-345821));
        assertArrayEquals(new int[]{1, 0}, instance.even_odd_count(-2));
        assertArrayEquals(new int[]{2, 3}, instance.even_odd_count(-45347));
        assertArrayEquals(new int[]{1, 0}, instance.even_odd_count(0));


        //The Python test includes assert True, which doesn't translate directly.  
        //Consider adding more comprehensive tests if needed, such as testing very large numbers or numbers with leading zeros.

    }
}
