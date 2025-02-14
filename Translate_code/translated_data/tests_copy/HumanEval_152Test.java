package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_152;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class HumanEval_152Test {

    @Test
    public void testCompareSimpleCases() {
        HumanEval_152 comparer = new HumanEval_152();
        assertEquals(Arrays.asList(0, 0, 0, 0, 3, 3), comparer.compare(Arrays.asList(1, 2, 3, 4, 5, 1), Arrays.asList(1, 2, 3, 4, 2, -2)));
        assertEquals(Arrays.asList(0, 0, 0, 0, 0, 0), comparer.compare(Arrays.asList(0, 0, 0, 0, 0, 0), Arrays.asList(0, 0, 0, 0, 0, 0)));
        assertEquals(Arrays.asList(2, 4, 6), comparer.compare(Arrays.asList(1, 2, 3), Arrays.asList(-1, -2, -3)));
        assertEquals(Arrays.asList(2, 0, 0, 1), comparer.compare(Arrays.asList(1, 2, 3, 5), Arrays.asList(-1, 2, 3, 4)));
    }

    @Test
    public void testCompareEdgeCases(){
        //The Python test had an assert True which doesn't really test anything.  
        //This is replaced with a simple test to ensure the method works with empty lists.
        HumanEval_152 comparer = new HumanEval_152();
        assertEquals(Arrays.asList(), comparer.compare(Arrays.asList(), Arrays.asList()));
    }
}
