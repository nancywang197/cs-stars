package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_107;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class HumanEval_107Test {

    @Test
    public void testEvenOddPalindrome() {
        HumanEval_107 eo = new HumanEval_107();
        assertArrayEquals(new int[]{8, 13}, eo.evenOddPalindrome(123));
        assertArrayEquals(new int[]{4, 6}, eo.evenOddPalindrome(12));
        assertArrayEquals(new int[]{1, 2}, eo.evenOddPalindrome(3));
        assertArrayEquals(new int[]{6, 8}, eo.evenOddPalindrome(63));
        assertArrayEquals(new int[]{5, 6}, eo.evenOddPalindrome(25));
        assertArrayEquals(new int[]{4, 6}, eo.evenOddPalindrome(19));
        assertArrayEquals(new int[]{4, 5}, eo.evenOddPalindrome(9));
        assertArrayEquals(new int[]{0, 1}, eo.evenOddPalindrome(1));
    }
}
