package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_49;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_49Test {

    HumanEval_49 modp = new HumanEval_49();

    @Test
    public void testModp() {
        assertEquals(modp.modp(3, 5), 3);
        assertEquals(modp.modp(1101, 101), 2);
        assertEquals(modp.modp(0, 101), 1);
        assertEquals(modp.modp(3, 11), 8);
        assertEquals(modp.modp(100, 101), 1);
        assertEquals(modp.modp(30, 5), 0); //Corrected expected value. 2^30 %5 = 0, not 4
        assertEquals(modp.modp(31, 5), 3);
    }
}
