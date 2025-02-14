package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_40;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_40Test {

    HumanEval_40 tester = new HumanEval_40();

    @Test
    public void testTriplesSumToZero1() {
        assertEquals(false, tester.triples_sum_to_zero(new int[]{1, 3, 5, 0}));
    }

    @Test
    public void testTriplesSumToZero2() {
        assertEquals(false, tester.triples_sum_to_zero(new int[]{1, 3, 5, -1}));
    }

    @Test
    public void testTriplesSumToZero3() {
        assertEquals(true, tester.triples_sum_to_zero(new int[]{1, 3, -2, 1}));
    }

    @Test
    public void testTriplesSumToZero4() {
        assertEquals(false, tester.triples_sum_to_zero(new int[]{1, 2, 3, 7}));
    }

    @Test
    public void testTriplesSumToZero5() {
        assertEquals(false, tester.triples_sum_to_zero(new int[]{1, 2, 5, 7}));
    }

    @Test
    public void testTriplesSumToZero6() {
        assertEquals(true, tester.triples_sum_to_zero(new int[]{2, 4, -5, 3, 9, 7}));
    }

    @Test
    public void testTriplesSumToZero7() {
        assertEquals(false, tester.triples_sum_to_zero(new int[]{1}));
    }

    @Test
    public void testTriplesSumToZero8() {
        assertEquals(false, tester.triples_sum_to_zero(new int[]{1, 3, 5, -100}));
    }

    @Test
    public void testTriplesSumToZero9() {
        assertEquals(true, tester.triples_sum_to_zero(new int[]{100, 3, 5, -100}));
    }
}
