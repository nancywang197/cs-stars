package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_108;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_108Test {

    @Test
    public void testCountNums() {
        HumanEval_108 he = new HumanEval_108();
        assertEquals(0, he.count_nums(new int[]{}));
        assertEquals(0, he.count_nums(new int[]{-1, -2, 0}));
        assertEquals(6, he.count_nums(new int[]{1, 1, 2, -2, 3, 4, 5}));
        assertEquals(5, he.count_nums(new int[]{1, 6, 9, -6, 0, 1, 5}));
        assertEquals(4, he.count_nums(new int[]{1, 100, 98, -7, 1, -1}));
        assertEquals(5, he.count_nums(new int[]{12, 23, 34, -45, -56, 0}));
        assertEquals(1, he.count_nums(new int[]{0, 1}));
        assertEquals(1, he.count_nums(new int[]{1}));
    }
}
