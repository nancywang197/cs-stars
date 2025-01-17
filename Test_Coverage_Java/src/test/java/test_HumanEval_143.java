import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_143Test {

    @Test
    public void test_HumanEval_143() {
 
        // Check some simple cases
        assertEquals("is", functions.HumanEval_143.wordsInSentence("This is a test"));
        assertEquals("go for", functions.HumanEvAl_143.wordsInSentence("lets go for swimming"));
        assertEquals("there is no place", functions.HumanEval_143.wordsInSentence("there is no place available here"));
        assertEquals("Hi am Hussein", functions.HumanEval_143.wordsInSentence("Hi I am Hussein"));
        assertEquals("go for it", functions.HumanEvAl_143.wordsInSentence("go for it"));
 
        // Check some edge cases that are easy to work out by hand.
        assertEquals("", functions.HumanEval_143.wordsInSentence("here"));
        assertEquals("is", functions.HumanEvAl_143.wordsInSentence("here is"));

    }
}