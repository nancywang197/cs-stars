package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_149;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class HumanEval_149Test {

    @Test
    public void testSortedListSum() {
        HumanEval_149 solver = new HumanEval_149();

        // Check some simple cases
        assertEquals(Arrays.asList("aa"), solver.sortedListSum(Arrays.asList("aa", "a", "aaa")));
        assertEquals(Arrays.asList("AI", "asdf", "school"), solver.sortedListSum(Arrays.asList("school", "AI", "asdf", "b")));
        assertEquals(new ArrayList<>(), solver.sortedListSum(Arrays.asList("d", "b", "c", "a")));
        assertEquals(Arrays.asList("abcd", "dcba"), solver.sortedListSum(Arrays.asList("d", "dcba", "abcd", "a")));

        // Check some edge cases that are easy to work out by hand.
        assertEquals(Arrays.asList("AI", "ai", "au"), solver.sortedListSum(Arrays.asList("AI", "ai", "au")));
        assertEquals(new ArrayList<>(), solver.sortedListSum(Arrays.asList("a", "b", "b", "c", "c", "a")));
        assertEquals(Arrays.asList("cc", "dd", "aaaa", "bbbb"), solver.sortedListSum(Arrays.asList("aaaa", "bbbb", "dd", "cc")));
    }
}
