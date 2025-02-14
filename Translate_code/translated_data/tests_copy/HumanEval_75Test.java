package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_75;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_75Test {

    HumanEval_75 solver = new HumanEval_75();

    @Test
    public void testIsMultiplyPrime() {
        assertEquals(false, solver.isMultiplyPrime(5));
        assertEquals(true, solver.isMultiplyPrime(30));
        assertEquals(true, solver.isMultiplyPrime(8));
        assertEquals(false, solver.isMultiplyPrime(10));
        assertEquals(true, solver.isMultiplyPrime(125));
        assertEquals(true, solver.isMultiplyPrime(3 * 5 * 7));
        assertEquals(false, solver.isMultiplyPrime(3 * 6 * 7));
        assertEquals(false, solver.isMultiplyPrime(9 * 9 * 9));
        assertEquals(false, solver.isMultiplyPrime(11 * 9 * 9));
        assertEquals(true, solver.isMultiplyPrime(11 * 13 * 7));
    }
}
