package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_65;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_65Test {

    @Test
    public void testCircularShift() {
        HumanEval_65 shifter = new HumanEval_65();
        assertEquals(shifter.circular_shift(100, 2), "001");
        assertEquals(shifter.circular_shift(12, 2), "12");
        assertEquals(shifter.circular_shift(97, 8), "79");
        assertEquals(shifter.circular_shift(12, 1), "21");
        assertEquals(shifter.circular_shift(11, 101), "11");
    }
}
