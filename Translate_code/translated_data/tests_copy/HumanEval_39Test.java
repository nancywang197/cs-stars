package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_39;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;


public class HumanEval_39Test {

    @Test
    public void testPrimeFib() {
        HumanEval_39 hf = new HumanEval_39();
        assertEquals(2, hf.prime_fib(1));
        assertEquals(3, hf.prime_fib(2));
        assertEquals(5, hf.prime_fib(3));
        assertEquals(13, hf.prime_fib(4));
        assertEquals(89, hf.prime_fib(5));
        assertEquals(233, hf.prime_fib(6));
        assertEquals(1597, hf.prime_fib(7));
        assertEquals(28657, hf.prime_fib(8));
        assertEquals(514229, hf.prime_fib(9));
        assertEquals(433494437, hf.prime_fib(10));
    }
}
