package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_162;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_162Test {

    private final HumanEval_162 humanEval_162 = new HumanEval_162();

    @Test
    public void testString_to_md5() {
        assertEquals("3e25960a79dbc69b674cd4ec67a72c62", humanEval_162.string_to_md5("Hello world"));
        assertNull(humanEval_162.string_to_md5(""));
        assertEquals("0ef78513b0cb8cef12743f5aeb35f888", humanEval_162.string_to_md5("A B C"));
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", humanEval_162.string_to_md5("password"));
        assertTrue(true); 
    }
}
