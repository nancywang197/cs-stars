package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_159;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class HumanEval_159Test {

    @Test
    public void testHumanEval_159() {
        HumanEval_159 eatFunc = new HumanEval_159();
        assertArrayEquals(new int[]{11, 4}, eatFunc.eat(5, 6, 10));
        assertArrayEquals(new int[]{12, 1}, eatFunc.eat(4, 8, 9));
        assertArrayEquals(new int[]{11, 0}, eatFunc.eat(1, 10, 10));
        assertArrayEquals(new int[]{7, 0}, eatFunc.eat(2, 11, 5));
        assertArrayEquals(new int[]{9, 2}, eatFunc.eat(4, 5, 7));
        assertArrayEquals(new int[]{5, 0}, eatFunc.eat(4, 5, 1));
    }
}
