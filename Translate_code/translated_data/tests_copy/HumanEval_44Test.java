package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_44;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_44Test {

    HumanEval_44 converter = new HumanEval_44();

    @Test
    public void testChangeBase() {
        assertEquals("22", converter.change_base(8, 3));
        assertEquals("100", converter.change_base(9, 3));
        assertEquals("11101010", converter.change_base(234, 2));
        assertEquals("10000", converter.change_base(16, 2));
        assertEquals("1000", converter.change_base(8, 2));
        assertEquals("111", converter.change_base(7, 2));
        for (int x = 2; x < 8; x++) {
            assertEquals(String.valueOf(x), converter.change_base(x, x + 1));
        }
    }
}
