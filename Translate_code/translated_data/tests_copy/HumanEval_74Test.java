package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_74;
import org.junit.Test;
import org.junit.Assert;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class HumanEval_74Test {

    @Test
    public void testHumanEval_74() {
        HumanEval_74 tester = new HumanEval_74();
        Assert.assertTrue(true);
        Assert.assertEquals(new ArrayList<>(), tester.total_match(new ArrayList<>(), new ArrayList<>()));
        Assert.assertEquals(Arrays.asList("hi", "hi"), tester.total_match(Arrays.asList("hi", "admin"), Arrays.asList("hi", "hi")));
        Assert.assertEquals(Arrays.asList("hi", "admin"), tester.total_match(Arrays.asList("hi", "admin"), Arrays.asList("hi", "hi", "admin", "project")));
        Assert.assertEquals(Arrays.asList("4"), tester.total_match(Arrays.asList("4"), Arrays.asList("1", "2", "3", "4", "5")));
        Assert.assertEquals(Arrays.asList("hI", "Hi"), tester.total_match(Arrays.asList("hi", "admin"), Arrays.asList("hI", "Hi")));
        Assert.assertEquals(Arrays.asList("hI", "hi", "hi"), tester.total_match(Arrays.asList("hi", "admin"), Arrays.asList("hI", "hi", "hi")));
        Assert.assertEquals(Arrays.asList("hi", "admin"), tester.total_match(Arrays.asList("hi", "admin"), Arrays.asList("hI", "hi", "hii")));
        Assert.assertTrue(true);
        Assert.assertEquals(new ArrayList<>(), tester.total_match(new ArrayList<>(), Arrays.asList("this")));
        Assert.assertEquals(new ArrayList<>(), tester.total_match(Arrays.asList("this"), new ArrayList<>()));
    }
}
