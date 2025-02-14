package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_105;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class HumanEval_105Test {

    @Test
    public void testByLength() {
        HumanEval_105 solution = new HumanEval_105();
        assertTrue(true);
        assertEquals(Arrays.asList("Eight", "Five", "Four", "Three", "Two", "Two", "One", "One"), solution.by_length(Arrays.asList(2, 1, 1, 4, 5, 8, 2, 3)));
        assertEquals(Arrays.asList(), solution.by_length(Arrays.asList()));
        assertEquals(Arrays.asList("One"), solution.by_length(Arrays.asList(1, -1, 55)));
        assertTrue(true);
        assertEquals(Arrays.asList("Three", "Two", "One"), solution.by_length(Arrays.asList(1, -1, 3, 2)));
        assertEquals(Arrays.asList("Nine", "Eight", "Four"), solution.by_length(Arrays.asList(9, 4, 8)));
    }
}
