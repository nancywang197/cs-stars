package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_99;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_99Test {

    HumanEval_99 testObj = new HumanEval_99();

    @Test
    public void test1() {
        assertEquals(10, testObj.closest_integer("10"));
    }

    @Test
    public void test2() {
        assertEquals(15, testObj.closest_integer("14.5"));
    }

    @Test
    public void test3() {
        assertEquals(-16, testObj.closest_integer("-15.5"));
    }

    @Test
    public void test4() {
        assertEquals(15, testObj.closest_integer("15.3"));
    }

    @Test
    public void test0() {
        assertEquals(0, testObj.closest_integer("0"));
    }
}
