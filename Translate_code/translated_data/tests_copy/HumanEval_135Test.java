package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_135;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_135Test {

    @Test
    public void testCanArrange() {
        HumanEval_135 tester = new HumanEval_135();
        assertEquals(3, tester.can_arrange(new int[]{1, 2, 4, 3, 5}));
        assertEquals(-1, tester.can_arrange(new int[]{1, 2, 4, 5}));
        assertEquals(2, tester.can_arrange(new int[]{1, 4, 2, 5, 6, 7, 8, 9, 10}));
        assertEquals(2, tester.can_arrange(new int[]{4,8,5,7,3}));
        assertEquals(-1, tester.can_arrange(new int[]{}));

    }
}
