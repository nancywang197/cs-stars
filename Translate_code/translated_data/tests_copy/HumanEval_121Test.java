package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_121;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_121Test {

    HumanEval_121 solution = new HumanEval_121();

    @Test
    public void testSolution() {
        assertEquals(12, solution.solution(new int[]{5, 8, 7, 1}));
        assertEquals(9, solution.solution(new int[]{3, 3, 3, 3, 3}));
        assertEquals(0, solution.solution(new int[]{30, 13, 24, 321}));
        assertEquals(5, solution.solution(new int[]{5, 9}));
        assertEquals(0, solution.solution(new int[]{2, 4, 8}));
        assertEquals(23, solution.solution(new int[]{30, 13, 23, 32}));
        assertEquals(3, solution.solution(new int[]{3, 13, 2, 9}));
    }
}
