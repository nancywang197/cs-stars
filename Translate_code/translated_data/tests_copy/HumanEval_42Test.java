package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_42;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class HumanEval_42Test {

    @Test
    public void testIncrListEmpty() {
        HumanEval_42 testInstance = new HumanEval_42();
        assertEquals(List.of(), testInstance.incr_list(List.of()));
    }

    @Test
    public void testIncrListExample1() {
        HumanEval_42 testInstance = new HumanEval_42();
        assertEquals(List.of(4, 3, 2), testInstance.incr_list(List.of(3, 2, 1)));
    }

    @Test
    public void testIncrListExample2() {
        HumanEval_42 testInstance = new HumanEval_42();
        assertEquals(List.of(6, 3, 6, 3, 4, 4, 10, 1, 124), testInstance.incr_list(List.of(5, 2, 5, 2, 3, 3, 9, 0, 123)));
    }
}
