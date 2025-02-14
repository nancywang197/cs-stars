package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_100;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class HumanEval_100Test {

    @Test
    public void testMakeAPile() {
        HumanEval_100 instance = new HumanEval_100();
        assertEquals(Arrays.asList(3, 5, 7), instance.make_a_pile(3));
        assertEquals(Arrays.asList(4, 6, 8, 10), instance.make_a_pile(4));
        assertEquals(Arrays.asList(5, 7, 9, 11, 13), instance.make_a_pile(5));
        assertEquals(Arrays.asList(6, 8, 10, 12, 14, 16), instance.make_a_pile(6));
        assertEquals(Arrays.asList(8, 10, 12, 14, 16, 18, 20, 22), instance.make_a_pile(8));
    }
}
