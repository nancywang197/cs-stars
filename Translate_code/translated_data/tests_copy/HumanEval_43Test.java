package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_43;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_43Test {

    HumanEval_43 solver = new HumanEval_43();

    @Test
    public void testPairsSumToZero() {
        assertEquals(false, solver.pairsSumToZero(new int[]{1, 3, 5, 0}));
        assertEquals(false, solver.pairsSumToZero(new int[]{1, 3, -2, 1}));
        assertEquals(false, solver.pairsSumToZero(new int[]{1, 2, 3, 7}));
        assertEquals(true, solver.pairsSumToZero(new int[]{2, 4, -5, 3, 5, 7}));
        assertEquals(false, solver.pairsSumToZero(new int[]{1}));

        assertEquals(true, solver.pairsSumToZero(new int[]{-3, 9, -1, 3, 2, 30}));
        assertEquals(true, solver.pairsSumToZero(new int[]{-3, 9, -1, 3, 2, 31}));
        assertEquals(false, solver.pairsSumToZero(new int[]{-3, 9, -1, 4, 2, 30}));
        assertEquals(false, solver.pairsSumToZero(new int[]{-3, 9, -1, 4, 2, 31}));
    }
}
