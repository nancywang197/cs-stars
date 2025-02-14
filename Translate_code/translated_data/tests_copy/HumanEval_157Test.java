package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_157;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_157Test {

    @Test
    public void testRightAngleTriangle() {
        HumanEval_157 triangle = new HumanEval_157();
        assertEquals(true, triangle.right_angle_triangle(3, 4, 5));
        assertEquals(false, triangle.right_angle_triangle(1, 2, 3));
        assertEquals(true, triangle.right_angle_triangle(10, 6, 8));
        assertEquals(false, triangle.right_angle_triangle(2, 2, 2));
        assertEquals(true, triangle.right_angle_triangle(7, 24, 25));
        assertEquals(false, triangle.right_angle_triangle(10, 5, 7));
        assertEquals(true, triangle.right_angle_triangle(5, 12, 13));
        assertEquals(true, triangle.right_angle_triangle(15, 8, 17));
        assertEquals(true, triangle.right_angle_triangle(48, 55, 73));
        assertEquals(false, triangle.right_angle_triangle(1, 1, 1));
        assertEquals(false, triangle.right_angle_triangle(2, 2, 10));
    }
}
