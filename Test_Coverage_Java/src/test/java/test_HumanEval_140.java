import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_140Test {

    @Test
    public void test_HumanEval_140() {
        // Check some simple cases
        assertEquals("Example", fixSpaces("Example"));
        assertEquals("Mudasir_Hanif_", fixSpaces("Mudasir Hanif "));
        assertEquals("Yellow_Yellow__Dirty__Fellow", fixSpaces("Yellow Yellow  Dirty Fellow"));

        // Check some edge cases that are easy to work out by hand.
        assertEquals("Exa-mple", fixSpaces("Exa   mple"));
        assertEquals("-Exa_1_2_2_mple", fixSpaces("   Exa 1 2 2 mple"));
    }

    // Assuming the function is in a class named HumanEval_140
    public String fixSpaces(String input) {
        StringBuilder result = new StringBuilder();
        boolean prevSpace = false;
        
        for (char c : input.toCharArray()) {
            if (c == ' ') {
                if (!prevSpace) {
                    result.append('_');
                    prevSpace = true;
                }
            } else {
                result.append(c);
                prevSpace = false;
            }
        }

        return result.toString();
    }
}