package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_26;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class HumanEval_26Test {
    @Test
    public void testRemoveDuplicatesEmpty() {
        HumanEval_26 remover = new HumanEval_26();
        List<Integer> input = List.of();
        List<Integer> expected = List.of();
        assertEquals(expected, remover.removeDuplicates(input));
    }

    @Test
    public void testRemoveDuplicatesNoDuplicates() {
        HumanEval_26 remover = new HumanEval_26();
        List<Integer> input = List.of(1, 2, 3, 4);
        List<Integer> expected = List.of(1, 2, 3, 4);
        assertEquals(expected, remover.removeDuplicates(input));
    }

    @Test
    public void testRemoveDuplicatesWithDuplicates() {
        HumanEval_26 remover = new HumanEval_26();
        List<Integer> input = List.of(1, 2, 3, 2, 4, 3, 5);
        List<Integer> expected = List.of(1, 4, 5);
        assertEquals(expected, remover.removeDuplicates(input));
    }
}
