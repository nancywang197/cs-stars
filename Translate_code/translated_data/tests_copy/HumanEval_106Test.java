package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_106;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;
import java.util.Arrays;

public class HumanEval_106Test {

    @Test
    public void testF1() {
        HumanEval_106 f = new HumanEval_106();
        List<Integer> expected = Arrays.asList(1, 2, 6, 24, 15);
        assertEquals(expected, f.f(5));
    }

    @Test
    public void testF2() {
        HumanEval_106 f = new HumanEval_106();
        List<Integer> expected = Arrays.asList(1, 2, 6, 24, 15, 720, 28);
        assertEquals(expected, f.f(7));
    }

    @Test
    public void testF3() {
        HumanEval_106 f = new HumanEval_106();
        List<Integer> expected = Arrays.asList(1);
        assertEquals(expected, f.f(1));
    }

    @Test
    public void testF4() {
        HumanEval_106 f = new HumanEval_106();
        List<Integer> expected = Arrays.asList(1, 2, 6);
        assertEquals(expected, f.f(3));
    }
}
