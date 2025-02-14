package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_118;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class HumanEval_118Test {

    @Test
    public void testGetClosestVowel() {
        HumanEval_118 solver = new HumanEval_118();
        assertEquals("u", solver.get_closest_vowel("yogurt"));
        assertEquals("u", solver.get_closest_vowel("full"));
        assertEquals("", solver.get_closest_vowel("easy"));
        assertEquals("", solver.get_closest_vowel("eAsy"));
        assertEquals("", solver.get_closest_vowel("ali"));
        assertEquals("a", solver.get_closest_vowel("bad"));
        assertEquals("o", solver.get_closest_vowel("most"));
        assertEquals("", solver.get_closest_vowel("ab"));
        assertEquals("", solver.get_closest_vowel("ba"));
        assertEquals("", solver.get_closest_vowel("quick"));
        assertEquals("i", solver.get_closest_vowel("anime"));
        assertEquals("", solver.get_closest_vowel("Asia"));
        assertEquals("o", solver.get_closest_vowel("Above"));
    }
}
