package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_88;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class HumanEval_88Test {

    @Test
    public void testSortArray() {
        HumanEval_88 sorter = new HumanEval_88();
        assertEquals(new ArrayList<>(), sorter.sort_array(new ArrayList<>()));
        assertEquals(Arrays.asList(5), sorter.sort_array(Arrays.asList(5)));
        assertEquals(Arrays.asList(0, 1, 2, 3, 4, 5), sorter.sort_array(Arrays.asList(2, 4, 3, 0, 1, 5)));
        assertEquals(Arrays.asList(6, 5, 4, 3, 2, 1, 0), sorter.sort_array(Arrays.asList(2, 4, 3, 0, 1, 5, 6)));
        assertEquals(Arrays.asList(1, 2), sorter.sort_array(Arrays.asList(2, 1)));
        assertEquals(Arrays.asList(0, 11, 15, 32, 42, 87), sorter.sort_array(Arrays.asList(15, 42, 87, 32, 11, 0)));
        assertEquals(Arrays.asList(23, 21, 14, 11), sorter.sort_array(Arrays.asList(21, 14, 23, 11)));
    }
}
