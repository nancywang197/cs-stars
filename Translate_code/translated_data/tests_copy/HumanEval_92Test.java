//package com.example.python_to_java.tests_copy;
//import com.example.python_to_java.functions_copy.HumanEval_92;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//public class HumanEval_92Test {
//
//    @Test
//    public void testAnyInt() {
//        HumanEval_92 any_int = new HumanEval_92();
//        assertEquals(true, any_int.any_int(2, 3, 1));
//        assertEquals(false, any_int.any_int(2.5, 2, 3));
//        assertEquals(false, any_int.any_int(1.5, 5, 3.5));
//        assertEquals(false, any_int.any_int(2, 6, 2));
//        assertEquals(true, any_int.any_int(4, 2, 2));
//        assertEquals(false, any_int.any_int(2.2, 2.2, 2.2));
//        assertEquals(true, any_int.any_int(-4, 6, 2));
//        assertEquals(true, any_int.any_int(2,1,1));
//        assertEquals(true, any_int.any_int(3,4,7));
//        assertEquals(false, any_int.any_int(3.0,4,7));
//    }
//}
//
//
//public class HumanEval_92 {
//    public boolean any_int(double a, double b, double c) {
//        return (a == (int)a) || (b == (int)b) || (c == (int)c);
//    }
//}
