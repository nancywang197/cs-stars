package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_31;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_31Test {

    HumanEval_31 is_prime_func = new HumanEval_31();

    @Test
    public void testIsPrime() {
        assertEquals(false, is_prime_func.is_prime(6));
        assertEquals(true, is_prime_func.is_prime(101));
        assertEquals(true, is_prime_func.is_prime(11));
        assertEquals(true, is_prime_func.is_prime(13441));
        assertEquals(true, is_prime_func.is_prime(61));
        assertEquals(false, is_prime_func.is_prime(4));
        assertEquals(false, is_prime_func.is_prime(1));
        assertEquals(true, is_prime_func.is_prime(5));
        assertEquals(true, is_prime_func.is_prime(11));
        assertEquals(true, is_prime_func.is_prime(17));
        assertEquals(false, is_prime_func.is_prime(5 * 17));
        assertEquals(false, is_prime_func.is_prime(11 * 7));
        assertEquals(false, is_prime_func.is_prime(13441 * 19));
    }
}
