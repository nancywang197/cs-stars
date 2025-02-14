package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_139;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_139Test {

    HumanEval_139 specialFactorialCalculator = new HumanEval_139();

    @Test
    public void testSpecialFactorial4() {
        assertEquals(288, specialFactorialCalculator.special_factorial(4));
    }

    @Test
    public void testSpecialFactorial5() {
        assertEquals(34560, specialFactorialCalculator.special_factorial(5));
    }

    @Test
    public void testSpecialFactorial7() {
        assertEquals(125411328000L, specialFactorialCalculator.special_factorial(7));
    }

    @Test
    public void testSpecialFactorial1() {
        assertEquals(1, specialFactorialCalculator.special_factorial(1));
    }
}
