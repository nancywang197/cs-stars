package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_17;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;

public class HumanEval_17Test {

    @Test
    public void testParseMusicEmpty() {
        HumanEval_17 parser = new HumanEval_17();
        assertEquals(Arrays.asList(), parser.parse_music(""));
    }

    @Test
    public void testParseMusicO() {
        HumanEval_17 parser = new HumanEval_17();
        assertEquals(Arrays.asList(4, 4, 4, 4), parser.parse_music("o o o o"));
    }

    @Test
    public void testParseMusicDotPipe() {
        HumanEval_17 parser = new HumanEval_17();
        assertEquals(Arrays.asList(1, 1, 1, 1), parser.parse_music(".| .| .| .|"));
    }

    @Test
    public void testParseMusicMixed() {
        HumanEval_17 parser = new HumanEval_17();
        assertEquals(Arrays.asList(2, 2, 1, 1, 4, 4, 4, 4), parser.parse_music("o| o| .| .| o o o o"));
    }

    @Test
    public void testParseMusicMixed2() {
        HumanEval_17 parser = new HumanEval_17();
        assertEquals(Arrays.asList(2, 1, 2, 1, 4, 2, 4, 2), parser.parse_music("o| .| o| .| o o| o o|"));
    }
}
