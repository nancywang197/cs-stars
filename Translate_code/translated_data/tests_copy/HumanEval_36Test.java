package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_36;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class HumanEval_36Test {

    @Test
    public void testFizzBuzz() {
        HumanEval_36 fizzBuzz = new HumanEval_36();
        assertEquals(0, fizzBuzz.fizz_buzz(50));
        assertEquals(2, fizzBuzz.fizz_buzz(78));
        assertEquals(3, fizzBuzz.fizz_buzz(79));
        assertEquals(3, fizzBuzz.fizz_buzz(100));
        assertEquals(6, fizzBuzz.fizz_buzz(200));
        assertEquals(192, fizzBuzz.fizz_buzz(4000));
        assertEquals(639, fizzBuzz.fizz_buzz(10000));
        assertEquals(8026, fizzBuzz.fizz_buzz(100000));
    }
}
