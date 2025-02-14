package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_24;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_24Test {

    HumanEval_24 tested = new HumanEval_24();

    @Test
    public void testLargestDivisor() {
        assertEquals(1, tested.largest_divisor(3));
        assertEquals(1, tested.largest_divisor(7));
        assertEquals(5, tested.largest_divisor(10));
        assertEquals(50, tested.largest_divisor(100));
        assertEquals(7, tested.largest_divisor(49));
    }
}
