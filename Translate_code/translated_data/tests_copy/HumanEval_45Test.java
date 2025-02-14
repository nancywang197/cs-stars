package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_45;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_45Test {

    HumanEval_45 te = new HumanEval_45();

    @Test
    public void testTriangleArea1() {
        assertEquals(7.5, te.triangle_area(5, 3), 0.001);
    }

    @Test
    public void testTriangleArea2() {
        assertEquals(2.0, te.triangle_area(2, 2), 0.001);
    }

    @Test
    public void testTriangleArea3() {
        assertEquals(40.0, te.triangle_area(10, 8), 0.001);
    }
}
