package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_103;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_103Test {

    @Test
    public void testRoundedAvg() {
        HumanEval_103 obj = new HumanEval_103();
        assertEquals("0b11", obj.rounded_avg(1, 5));
        assertEquals("0b1010", obj.rounded_avg(7, 13));
        assertEquals("0b1111001010", obj.rounded_avg(964, 977));
        assertEquals("0b1111100100", obj.rounded_avg(996, 997));
        assertEquals("0b1011000010", obj.rounded_avg(560, 851));
        assertEquals("0b101101110", obj.rounded_avg(185, 546));
        assertEquals("0b110101101", obj.rounded_avg(362, 496));
        assertEquals("0b1001110010", obj.rounded_avg(350, 902));
        assertEquals("0b11010111", obj.rounded_avg(197, 233));
        assertEquals("-1", obj.rounded_avg(7, 5));
        assertEquals("-1", obj.rounded_avg(5, 1));
        assertEquals("0b101", obj.rounded_avg(5, 5));
    }
}
