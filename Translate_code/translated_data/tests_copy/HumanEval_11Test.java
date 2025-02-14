package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_11;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_11Test {

    HumanEval_11 stringXor = new HumanEval_11();

    @Test
    public void testStringXor1() {
        assertEquals("010010", stringXor.string_xor("111000", "101010"));
    }

    @Test
    public void testStringXor2() {
        assertEquals("0", stringXor.string_xor("1", "1"));
    }

    @Test
    public void testStringXor3() {
        assertEquals("0101", stringXor.string_xor("0101", "0000"));
    }
}
