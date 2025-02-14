package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_82;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_82Test {

    HumanEval_82 primeLengthChecker = new HumanEval_82();

    @Test
    public void testPrimeLength() {
        assertEquals(true, primeLengthChecker.prime_length("Hello"));
        assertEquals(true, primeLengthChecker.prime_length("abcdcba"));
        assertEquals(true, primeLengthChecker.prime_length("kittens"));
        assertEquals(false, primeLengthChecker.prime_length("orange"));
        assertEquals(true, primeLengthChecker.prime_length("wow"));
        assertEquals(true, primeLengthChecker.prime_length("world"));
        assertEquals(true, primeLengthChecker.prime_length("MadaM"));
        assertEquals(true, primeLengthChecker.prime_length("Wow"));
        assertEquals(false, primeLengthChecker.prime_length(""));
        assertEquals(true, primeLengthChecker.prime_length("HI"));
        assertEquals(true, primeLengthChecker.prime_length("go"));
        assertEquals(false, primeLengthChecker.prime_length("gogo"));
        assertEquals(false, primeLengthChecker.prime_length("aaaaaaaaaaaaaaa"));
        assertEquals(true, primeLengthChecker.prime_length("Madam"));
        assertEquals(false, primeLengthChecker.prime_length("M"));
        assertEquals(false, primeLengthChecker.prime_length("0"));
    }
}
