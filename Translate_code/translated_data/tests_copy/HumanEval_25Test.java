package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_25;
import org.junit.Test;
import org.junit.Assert;
import java.util.Arrays;
import java.util.List;

public class HumanEval_25Test {

    @Test
    public void testFactorize() {
        HumanEval_25 factorizer = new HumanEval_25();
        Assert.assertEquals(Arrays.asList(2), factorizer.factorize(2));
        Assert.assertEquals(Arrays.asList(2, 2), factorizer.factorize(4));
        Assert.assertEquals(Arrays.asList(2, 2, 2), factorizer.factorize(8));
        Assert.assertEquals(Arrays.asList(3, 19), factorizer.factorize(3 * 19));
        Assert.assertEquals(Arrays.asList(3, 3, 19, 19), factorizer.factorize(3 * 19 * 3 * 19));
        Assert.assertEquals(Arrays.asList(3, 3, 3, 19, 19, 19), factorizer.factorize(3 * 19 * 3 * 19 * 3 * 19));
        Assert.assertEquals(Arrays.asList(3, 19, 19, 19), factorizer.factorize(3 * 19 * 19 * 19));
        Assert.assertEquals(Arrays.asList(2, 3, 3), factorizer.factorize(3 * 2 * 3));
    }
}
