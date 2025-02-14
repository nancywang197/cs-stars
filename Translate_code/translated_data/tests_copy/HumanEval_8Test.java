package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_8;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;

public class HumanEval_8Test {

    @Test
    public void testEmptyList() {
        HumanEval_8 instance = new HumanEval_8();
        assertArrayEquals(new int[]{0, 1}, instance.sum_product(Arrays.asList()));
    }

    @Test
    public void testAllOnes() {
        HumanEval_8 instance = new HumanEval_8();
        assertArrayEquals(new int[]{3, 1}, instance.sum_product(Arrays.asList(1, 1, 1)));
    }

    @Test
    public void testWithZero() {
        HumanEval_8 instance = new HumanEval_8();
        assertArrayEquals(new int[]{100, 0}, instance.sum_product(Arrays.asList(100, 0)));
    }

    @Test
    public void testSumProduct() {
        HumanEval_8 instance = new HumanEval_8();
        assertArrayEquals(new int[]{15, 105}, instance.sum_product(Arrays.asList(3, 5, 7)));
    }

    @Test
    public void testSingleElement() {
        HumanEval_8 instance = new HumanEval_8();
        assertArrayEquals(new int[]{10, 10}, instance.sum_product(Arrays.asList(10)));
    }
}
