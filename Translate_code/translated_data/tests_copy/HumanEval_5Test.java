package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_5;
import org.junit.Test;
import org.junit.Assert;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class HumanEval_5Test {

    @Test
    public void testIntersperseEmptyList() {
        HumanEval_5 intersperse = new HumanEval_5();
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = intersperse.intersperse(new ArrayList<>(), 7);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIntersperseMultipleElements() {
        HumanEval_5 intersperse = new HumanEval_5();
        List<Integer> expected = Arrays.asList(5, 8, 6, 8, 3, 8, 2);
        List<Integer> actual = intersperse.intersperse(Arrays.asList(5, 6, 3, 2), 8);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIntersperseSameDelimiter() {
        HumanEval_5 intersperse = new HumanEval_5();
        List<Integer> expected = Arrays.asList(2, 2, 2, 2, 2);
        List<Integer> actual = intersperse.intersperse(Arrays.asList(2, 2, 2), 2);
        Assert.assertEquals(expected, actual);
    }
}
