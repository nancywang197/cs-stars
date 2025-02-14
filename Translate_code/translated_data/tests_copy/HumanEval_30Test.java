package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_30;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class HumanEval_30Test {
    @Test
    public void testGetPositive1() {
        HumanEval_30 instance = new HumanEval_30();
        List<Integer> input = Arrays.asList(-1, -2, 4, 5, 6);
        List<Integer> expected = Arrays.asList(4, 5, 6);
        assertEquals(expected, instance.get_positive(input));
    }

    @Test
    public void testGetPositive2() {
        HumanEval_30 instance = new HumanEval_30();
        List<Integer> input = Arrays.asList(5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10);
        List<Integer> expected = Arrays.asList(5, 3, 2, 3, 3, 9, 123, 1);
        assertEquals(expected, instance.get_positive(input));
    }

    @Test
    public void testGetPositive3() {
        HumanEval_30 instance = new HumanEval_30();
        List<Integer> input = Arrays.asList(-1, -2);
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, instance.get_positive(input));
    }

    @Test
    public void testGetPositive4() {
        HumanEval_30 instance = new HumanEval_30();
        List<Integer> input = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, instance.get_positive(input));
    }
}
