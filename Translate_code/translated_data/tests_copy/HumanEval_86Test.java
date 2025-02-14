package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_86;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_86Test {

    @Test
    public void testAntiShuffle() {
        HumanEval_86 antiShuffle = new HumanEval_86();
        assertEquals("Hi", antiShuffle.anti_shuffle("Hi"));
        assertEquals("ehllo", antiShuffle.anti_shuffle("hello"));
        assertEquals("bemnru", antiShuffle.anti_shuffle("number"));
        assertEquals("abcd", antiShuffle.anti_shuffle("abcd"));
        assertEquals("Hello !!!Wdlor", antiShuffle.anti_shuffle("Hello World!!!"));
        assertEquals("", antiShuffle.anti_shuffle(""));
        assertEquals(".Hi My aemn is Meirst .Rboot How aer ?ouy", antiShuffle.anti_shuffle("Hi. My name is Mister Robot. How are you?"));
    }
}
