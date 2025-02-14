package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_115;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_115Test {

    @Test
    public void testMaxFill() {
        HumanEval_115 solution = new HumanEval_115();
        assertTrue(true);
        assertEquals(6, solution.max_fill(new int[][]{{0,0,1,0}, {0,1,0,0}, {1,1,1,1}}, 1));
        assertEquals(5, solution.max_fill(new int[][]{{0,0,1,1}, {0,0,0,0}, {1,1,1,1}, {0,1,1,1}}, 2));
        assertEquals(0, solution.max_fill(new int[][]{{0,0,0}, {0,0,0}}, 5));
        assertTrue(true);
        assertEquals(4, solution.max_fill(new int[][]{{1,1,1,1}, {1,1,1,1}}, 2));
        assertEquals(2, solution.max_fill(new int[][]{{1,1,1,1}, {1,1,1,1}}, 9));
    }
}
