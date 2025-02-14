package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_7;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class HumanEval_7Test {

    @Test
    public void testEmptyList() {
        HumanEval_7 filter = new HumanEval_7();
        assertEquals(new ArrayList<>(), filter.filterBySubstring(new ArrayList<>(), "john"));
    }

    @Test
    public void testSubstringExists() {
        HumanEval_7 filter = new HumanEval_7();
        List<String> input = Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx");
        List<String> expected = Arrays.asList("xxx", "xxxAAA", "xxx");
        assertEquals(expected, filter.filterBySubstring(input, "xxx"));
    }

    @Test
    public void testPartialSubstring() {
        HumanEval_7 filter = new HumanEval_7();
        List<String> input = Arrays.asList("xxx", "asd", "aaaxxy", "john doe", "xxxAAA", "xxx");
        List<String> expected = Arrays.asList("xxx", "aaaxxy", "xxxAAA", "xxx");
        assertEquals(expected, filter.filterBySubstring(input, "xx"));
    }

    @Test
    public void testSubstringMultipleMatches() {
        HumanEval_7 filter = new HumanEval_7();
        List<String> input = Arrays.asList("grunt", "trumpet", "prune", "gruesome");
        List<String> expected = Arrays.asList("grunt", "prune");
        assertEquals(expected, filter.filterBySubstring(input, "run"));
    }
}
