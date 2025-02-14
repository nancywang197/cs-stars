package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_78;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_78Test {

    @Test
    public void testHexKey() {
        HumanEval_78 hexKey = new HumanEval_78();
        assertEquals(1, hexKey.hex_key("AB"));
        assertEquals(2, hexKey.hex_key("1077E"));
        assertEquals(4, hexKey.hex_key("ABED1A33"));
        assertEquals(2, hexKey.hex_key("2020"));
        assertEquals(6, hexKey.hex_key("123456789ABCDEF0"));
        assertEquals(12, hexKey.hex_key("112233445566778899AABBCCDDEEFF00"));
        assertEquals(0, hexKey.hex_key("")); 
    }
}
