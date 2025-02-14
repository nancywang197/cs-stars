package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_131;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_131Test {

    HumanEval_131 digitsFunction = new HumanEval_131();

    @Test
    public void testDigits() {
        assertEquals(5, digitsFunction.digits(5));
        assertEquals(5, digitsFunction.digits(54));
        assertEquals(1, digitsFunction.digits(120));
        assertEquals(5, digitsFunction.digits(5014));
        assertEquals(315, digitsFunction.digits(98765));
        assertEquals(2625, digitsFunction.digits(5576543));
        assertEquals(0, digitsFunction.digits(2468));
    }
}
