package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_15;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_15Test {

    HumanEval_15 solution = new HumanEval_15();

    @Test
    public void test_string_sequence_0() {
        assertEquals("0", solution.string_sequence(0));
    }

    @Test
    public void test_string_sequence_3() {
        assertEquals("0 1 2 3", solution.string_sequence(3));
    }

    @Test
    public void test_string_sequence_10() {
        assertEquals("0 1 2 3 4 5 6 7 8 9 10", solution.string_sequence(10));
    }
}
