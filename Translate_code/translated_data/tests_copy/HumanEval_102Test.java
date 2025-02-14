package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_102;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_102Test {

    HumanEval_102 chooseNum = new HumanEval_102();

    @Test
    public void testChooseNum() {
        assertEquals(14, chooseNum.choose_num(12, 15));
        assertEquals(-1, chooseNum.choose_num(13, 12));
        assertEquals(12354, chooseNum.choose_num(33, 12354));
        assertEquals(-1, chooseNum.choose_num(5234, 5233));
        assertEquals(28, chooseNum.choose_num(6, 29));
        assertEquals(-1, chooseNum.choose_num(27, 10));
        assertEquals(-1, chooseNum.choose_num(7, 7));
        assertEquals(546, chooseNum.choose_num(546, 546));
    }
}
