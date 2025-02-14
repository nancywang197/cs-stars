package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_120;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class HumanEval_120Test {

    @Test
    public void testMaximum() {
        HumanEval_120 solution = new HumanEval_120();
        assertEquals(Arrays.asList(-4, -3, 5), solution.maximum(Arrays.asList(-3, -4, 5), 3));
        assertEquals(Arrays.asList(4, 4), solution.maximum(Arrays.asList(4, -4, 4), 2));
        assertEquals(Arrays.asList(2), solution.maximum(Arrays.asList(-3, 2, 1, 2, -1, -2, 1), 1));
        assertEquals(Arrays.asList(2, 20, 123), solution.maximum(Arrays.asList(123, -123, 20, 0, 1, 2, -3), 3));
        assertEquals(Arrays.asList(0, 1, 2, 20), solution.maximum(Arrays.asList(-123, 20, 0, 1, 2, -3), 4));
        assertEquals(Arrays.asList(-13, -8, 0, 0, 3, 5, 15), solution.maximum(Arrays.asList(5, 15, 0, 3, -13, -8, 0), 7));
        assertEquals(Arrays.asList(3, 5), solution.maximum(Arrays.asList(-1, 0, 2, 5, 3, -10), 2));
        assertEquals(Arrays.asList(5), solution.maximum(Arrays.asList(1, 0, 5, -7), 1));
        assertEquals(Arrays.asList(-4, 4), solution.maximum(Arrays.asList(4, -4), 2));
        assertEquals(Arrays.asList(-10, 10), solution.maximum(Arrays.asList(-10, 10), 2));
        assertEquals(Arrays.asList(), solution.maximum(Arrays.asList(1, 2, 3, -23, 243, -400, 0), 0));
    }
}
