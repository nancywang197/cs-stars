package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_3;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class HumanEval_3Test {

    @Test
    public void testBelowZeroEmptyList() {
        HumanEval_3 instance = new HumanEval_3();
        List<Integer> operations = Arrays.asList();
        assertFalse(instance.belowZero(operations));
    }

    @Test
    public void testBelowZeroPositiveAndNegativeNumbers1() {
        HumanEval_3 instance = new HumanEval_3();
        List<Integer> operations = Arrays.asList(1, 2, -3, 1, 2, -3);
        assertFalse(instance.belowZero(operations));
    }

    @Test
    public void testBelowZeroGoesBelowZero1() {
        HumanEval_3 instance = new HumanEval_3();
        List<Integer> operations = Arrays.asList(1, 2, -4, 5, 6);
        assertTrue(instance.belowZero(operations));
    }

    @Test
    public void testBelowZeroPositiveAndNegativeNumbers2() {
        HumanEval_3 instance = new HumanEval_3();
        List<Integer> operations = Arrays.asList(1, -1, 2, -2, 5, -5, 4, -4);
        assertFalse(instance.belowZero(operations));
    }

    @Test
    public void testBelowZeroGoesBelowZero2() {
        HumanEval_3 instance = new HumanEval_3();
        List<Integer> operations = Arrays.asList(1, -1, 2, -2, 5, -5, 4, -5);
        assertTrue(instance.belowZero(operations));
    }

    @Test
    public void testBelowZeroGoesBelowZero3() {
        HumanEval_3 instance = new HumanEval_3();
        List<Integer> operations = Arrays.asList(1, -2, 2, -2, 5, -5, 4, -4);
        assertTrue(instance.belowZero(operations));
    }
}
