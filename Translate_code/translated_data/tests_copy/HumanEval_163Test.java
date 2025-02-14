package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_163;
import org.junit.Test;
import org.junit.Assert;
import java.util.Arrays;
import java.util.List;

public class HumanEval_163Test {
    @Test
    public void testGenerateIntegers1() {
        HumanEval_163 generator = new HumanEval_163();
        List<Integer> result = generator.generateIntegers(2, 10);
        Assert.assertEquals(Arrays.asList(2, 4, 6, 8), result);
    }

    @Test
    public void testGenerateIntegers2() {
        HumanEval_163 generator = new HumanEval_163();
        List<Integer> result = generator.generateIntegers(10, 2);
        Assert.assertEquals(Arrays.asList(2, 4, 6, 8), result);
    }

    @Test
    public void testGenerateIntegers3() {
        HumanEval_163 generator = new HumanEval_163();
        List<Integer> result = generator.generateIntegers(132, 2);
        Assert.assertEquals(Arrays.asList(2, 4, 6, 8), result);
    }

    @Test
    public void testGenerateIntegers4() {
        HumanEval_163 generator = new HumanEval_163();
        List<Integer> result = generator.generateIntegers(17, 89);
        Assert.assertEquals(Arrays.asList(), result);
    }

    @Test
    public void testGenerateIntegers5(){
        Assert.assertTrue(true);
    }
}
