package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_122;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_122Test {

    HumanEval_122 he = new HumanEval_122();

    @Test
    public void testAddElements() {
        assertEquals(he.add_elements(new int[]{1,-2,-3,41,57,76,87,88,99}, 3), -4);
        assertEquals(he.add_elements(new int[]{111,121,3,4000,5,6}, 2), 0);
        assertEquals(he.add_elements(new int[]{11,21,3,90,5,6,7,8,9}, 4), 125);
        assertEquals(he.add_elements(new int[]{111,21,3,4000,5,6,7,8,9}, 4), 24);
        assertEquals(he.add_elements(new int[]{1}, 1), 1);
    }
}
