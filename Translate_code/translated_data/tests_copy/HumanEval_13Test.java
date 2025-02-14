package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_13;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_13Test {
    @Test
    public void testGreatestCommonDivisor() {
        HumanEval_13 gcd = new HumanEval_13();
        assertEquals(1, gcd.greatest_common_divisor(3, 7));
        assertEquals(5, gcd.greatest_common_divisor(10, 15));
        assertEquals(7, gcd.greatest_common_divisor(49, 14));
        assertEquals(12, gcd.greatest_common_divisor(144, 60));
    }
}
