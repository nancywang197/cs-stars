package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_101;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class HumanEval_101Test {

    HumanEval_101 solution = new HumanEval_101();

    @Test
    public void testWordsString() {
        assertEquals(Arrays.asList("Hi", "my", "name", "is", "John"), solution.words_string("Hi, my name is John"));
        assertEquals(Arrays.asList("One", "two", "three", "four", "five", "six"), solution.words_string("One, two, three, four, five, six"));
        assertEquals(Arrays.asList("Hi", "my", "name"), solution.words_string("Hi, my name"));
        assertEquals(Arrays.asList("One", "two", "three", "four", "five", "six"), solution.words_string("One,, two, three, four, five, six,"));
        assertEquals(Arrays.asList(), solution.words_string(""));
        assertEquals(Arrays.asList("ahmed", "gamal"), solution.words_string("ahmed     , gamal"));
    }
}
