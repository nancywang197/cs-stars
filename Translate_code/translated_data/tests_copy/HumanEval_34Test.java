package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_34;
import org.junit.Test;
import org.junit.Assert;
import java.util.List;
import java.util.Arrays;

public class HumanEval_34Test {

    @Test
    public void testUnique() {
        HumanEval_34 humanEval = new HumanEval_34();
        List<Integer> input = Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123);
        List<Integer> expected = Arrays.asList(0, 2, 3, 5, 9, 123);
        Assert.assertEquals(expected, humanEval.unique(input));
    }
}
