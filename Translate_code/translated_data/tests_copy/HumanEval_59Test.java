package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_59;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_59Test {

    @Test
    public void testLargestPrimeFactor() {
        HumanEval_59 test = new HumanEval_59();
        assertEquals(5, test.largest_prime_factor(15));
        assertEquals(3, test.largest_prime_factor(27));
        assertEquals(7, test.largest_prime_factor(63));
        assertEquals(11, test.largest_prime_factor(330));
        assertEquals(29, test.largest_prime_factor(13195));
    }
}
