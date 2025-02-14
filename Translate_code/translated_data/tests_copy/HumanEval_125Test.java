package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_125;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class HumanEval_125Test {

    HumanEval_125 splitWords = new HumanEval_125();

    @Test
    public void testSplitWords1() {
        assertArrayEquals(new String[]{"Hello", "world!"}, (String[]) splitWords.split_words("Hello world!"));
    }

    @Test
    public void testSplitWords2() {
        assertArrayEquals(new String[]{"Hello", "world!"}, (String[]) splitWords.split_words("Hello,world!"));
    }

    @Test
    public void testSplitWords3() {
        assertArrayEquals(new String[]{"Hello", "world,!"}, (String[]) splitWords.split_words("Hello world,!"));
    }

    @Test
    public void testSplitWords4() {
        assertArrayEquals(new String[]{"Hello,Hello,world", "!"}, (String[]) splitWords.split_words("Hello,Hello,world !"));
    }

    @Test
    public void testSplitWords5() {
        assertEquals(3, splitWords.split_words("abcdef"));
    }

    @Test
    public void testSplitWords6() {
        assertEquals(2, splitWords.split_words("aaabb"));
    }

    @Test
    public void testSplitWords7() {
        assertEquals(1, splitWords.split_words("aaaBb"));
    }

    @Test
    public void testSplitWords8() {
        assertEquals(0, splitWords.split_words(""));
    }
}
