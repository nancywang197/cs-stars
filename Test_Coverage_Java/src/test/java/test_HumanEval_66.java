import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval66Test {

    @Test
    public void test_HumanEval_66() {
 
        // Check some simple cases
        assertEquals(0, humanEval66("", 0));
        assertEquals(131, humanEval66("abAB", 131), "Error");
        assertEquals(67, humanEval66("abcCd", 67), "Error");
        assertEquals(69, humanEval66("helloE", 69), "Error");
        assertEquals(131, humanEval66("woArBld", 131), "Error");
        assertEquals(153, humanEval66("aAaaaXa", 153), "Error");
 
        // Check some edge cases that are easy to work out by hand.
        assertEquals(151, humanEval66(" How are yOu?", 151), "Error");
        assertEquals(327, humanEval66("You arE Very Smart"), 327);
    }

    public int humanEval66(String s, int d) {
        // implementation of the digitSum function goes here
        // replace with actual implementation
        return d;
    }
}