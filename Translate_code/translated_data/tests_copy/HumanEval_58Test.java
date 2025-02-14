package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_58;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;


public class HumanEval_58Test {

    @Test
    public void testCommon1() {
        HumanEval_58 common = new HumanEval_58();
        List<Integer> l1 = Arrays.asList(1, 4, 3, 34, 653, 2, 5);
        List<Integer> l2 = Arrays.asList(5, 7, 1, 5, 9, 653, 121);
        List<Integer> expected = Arrays.asList(1, 5, 653);
        assertEquals(expected, common.common(l1, l2));
    }

    @Test
    public void testCommon2() {
        HumanEval_58 common = new HumanEval_58();
        List<Integer> l1 = Arrays.asList(5, 3, 2, 8);
        List<Integer> l2 = Arrays.asList(3, 2);
        List<Integer> expected = Arrays.asList(2, 3);
        assertEquals(expected, common.common(l1, l2));
    }

    @Test
    public void testCommon3() {
        HumanEval_58 common = new HumanEval_58();
        List<Integer> l1 = Arrays.asList(4, 3, 2, 8);
        List<Integer> l2 = Arrays.asList(3, 2, 4);
        List<Integer> expected = Arrays.asList(2, 3, 4);
        assertEquals(expected, common.common(l1, l2));
    }

    @Test
    public void testCommon4() {
        HumanEval_58 common = new HumanEval_58();
        List<Integer> l1 = Arrays.asList(4, 3, 2, 8);
        List<Integer> l2 = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, common.common(l1, l2));
    }
}
