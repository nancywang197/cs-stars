package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_148;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class HumanEval_148Test {

    @Test
    public void testSimpleCases() {
        HumanEval_148 solver = new HumanEval_148();
        assertArrayEquals(new String[]{"Saturn", "Uranus"}, solver.bf("Jupiter", "Neptune"));
        assertArrayEquals(new String[]{"Venus"}, solver.bf("Earth", "Mercury"));
        assertArrayEquals(new String[]{"Venus", "Earth", "Mars", "Jupiter", "Saturn"}, solver.bf("Mercury", "Uranus"));
        assertArrayEquals(new String[]{"Earth", "Mars", "Jupiter", "Saturn", "Uranus"}, solver.bf("Neptune", "Venus"));
    }

    @Test
    public void testEdgeCases() {
        HumanEval_148 solver = new HumanEval_148();
        assertArrayEquals(new String[0], solver.bf("Earth", "Earth"));
        assertArrayEquals(new String[0], solver.bf("Mars", "Earth"));
        assertArrayEquals(new String[0], solver.bf("Jupiter", "Makemake")); 
    }
}
