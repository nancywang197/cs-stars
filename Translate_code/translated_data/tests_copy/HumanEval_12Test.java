package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_12;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;

public class HumanEval_12Test {

    @Test
    public void testLongestEmptyList() {
        HumanEval_12 humanEval_12 = new HumanEval_12();
        assertEquals(null, humanEval_12.longest(List.of()));
    }

    @Test
    public void testLongestShortStrings() {
        HumanEval_12 humanEval_12 = new HumanEval_12();
        assertEquals("x", humanEval_12.longest(List.of("x", "y", "z")));
    }

    @Test
    public void testLongestMixedStrings() {
        HumanEval_12 humanEval_12 = new HumanEval_12();
        assertEquals("zzzz", humanEval_12.longest(List.of("x", "yyy", "zzzz", "www", "kkkk", "abc")));
    }
}
