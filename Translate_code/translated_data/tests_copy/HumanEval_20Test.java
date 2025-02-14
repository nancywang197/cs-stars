package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_20;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import java.util.Arrays;
import java.util.List;

public class HumanEval_20Test {

    @Test
    public void testFindClosestElements1() {
        HumanEval_20 finder = new HumanEval_20();
        double[] expected = {3.9, 4.0};
        assertArrayEquals(expected, finder.findClosestElements(Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2)),0.001);
    }

    @Test
    public void testFindClosestElements2() {
        HumanEval_20 finder = new HumanEval_20();
        double[] expected = {5.0, 5.9};
        assertArrayEquals(expected, finder.findClosestElements(Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0)),0.001);
    }

    @Test
    public void testFindClosestElements3() {
        HumanEval_20 finder = new HumanEval_20();
        double[] expected = {2.0, 2.2};
        assertArrayEquals(expected, finder.findClosestElements(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.2)),0.001);
    }

    @Test
    public void testFindClosestElements4() {
        HumanEval_20 finder = new HumanEval_20();
        double[] expected = {2.0, 2.0};
        assertArrayEquals(expected, finder.findClosestElements(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0)),0.001);
    }

    @Test
    public void testFindClosestElements5() {
        HumanEval_20 finder = new HumanEval_20();
        double[] expected = {2.2, 3.1};
        assertArrayEquals(expected, finder.findClosestElements(Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1)),0.001);
    }
}
