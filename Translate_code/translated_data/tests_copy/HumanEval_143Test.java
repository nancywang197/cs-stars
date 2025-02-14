package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_143;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_143Test {

    @Test
    public void testWordsInSentence() {
        HumanEval_143 solver = new HumanEval_143();

        // Check some simple cases
        assertEquals("is", solver.wordsInSentence("This is a test"));
        assertEquals("go for", solver.wordsInSentence("lets go for swimming"));
        assertEquals("there is no place", solver.wordsInSentence("there is no place available here"));
        assertEquals("Hi am Hussein", solver.wordsInSentence("Hi I am Hussein"));
        assertEquals("go for it", solver.wordsInSentence("go for it"));

        // Check some edge cases that are easy to work out by hand.
        assertEquals("", solver.wordsInSentence("here"));
        assertEquals("is", solver.wordsInSentence("here is"));
    }
}
