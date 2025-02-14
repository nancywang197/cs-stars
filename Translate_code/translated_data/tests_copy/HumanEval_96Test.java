package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_96;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;

public class HumanEval_96Test {

    @Test
    public void testCountUpTo() {
        HumanEval_96 counter = new HumanEval_96();
        assertEquals(Arrays.asList(2, 3), counter.countUpTo(5));
        assertEquals(Arrays.asList(2, 3, 5), counter.countUpTo(6));
        assertEquals(Arrays.asList(2, 3, 5), counter.countUpTo(7));
        assertEquals(Arrays.asList(2, 3, 5, 7), counter.countUpTo(10));
        assertEquals(Arrays.asList(), counter.countUpTo(0));
        assertEquals(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19), counter.countUpTo(22));
        assertEquals(Arrays.asList(), counter.countUpTo(1));
        assertEquals(Arrays.asList(2, 3, 5, 7, 11, 13, 17), counter.countUpTo(18));
        assertEquals(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43), counter.countUpTo(47));
        assertEquals(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97), counter.countUpTo(101));
    }
}
