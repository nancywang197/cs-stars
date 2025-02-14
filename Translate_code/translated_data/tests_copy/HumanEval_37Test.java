package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_37;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertArrayEquals;

public class HumanEval_37Test {

    @Test
    public void testSortEven1() {
        HumanEval_37 solution = new HumanEval_37();
        List<Integer> input = Arrays.asList(1, 2, 3);
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertArrayEquals(expected.toArray(), solution.sort_even(input).toArray());
    }

    @Test
    public void testSortEven2() {
        HumanEval_37 solution = new HumanEval_37();
        List<Integer> input = Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
        List<Integer> expected = Arrays.asList(-10, 3, -5, 2, -3, 3, 5, 0, 9, 1, 123);
        assertArrayEquals(expected.toArray(), solution.sort_even(input).toArray());
    }

    @Test
    public void testSortEven3() {
        HumanEval_37 solution = new HumanEval_37();
        List<Integer> input = Arrays.asList(5, 8, -12, 4, 23, 2, 3, 11, 12, -10);
        List<Integer> expected = Arrays.asList(-12, 8, 3, 4, 5, 2, 12, 11, 23, -10);
        assertArrayEquals(expected.toArray(), solution.sort_even(input).toArray());
    }
}
