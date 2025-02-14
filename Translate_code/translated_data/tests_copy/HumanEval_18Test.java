package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_18;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_18Test {

    HumanEval_18 instance = new HumanEval_18();

    @Test
    public void test1() {
        assertEquals(0, instance.howManyTimes("", "x"));
    }

    @Test
    public void test2() {
        assertEquals(4, instance.howManyTimes("xyxyxyx", "x"));
    }

    @Test
    public void test3() {
        assertEquals(4, instance.howManyTimes("cacacacac", "cac"));
    }

    @Test
    public void test4() {
        assertEquals(1, instance.howManyTimes("john doe", "john"));
    }
}
