import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_118Test {

    @Test
    public void testGetClosestVowelSimpleCases() {
        // Check some simple cases
        assertEquals("u", getClosestVowel("yogurt"));
        assertEquals("u", getClosestVowel("full"));
        assertEquals("", getClosestVowel("easy"));
        assertEquals("", getClosestVowel("eAsy"));
        assertEquals("", getClosestVowel("ali"));
        assertEquals("a", getClosestVowel("bad"));
        assertEquals("o", getClosestVowel("most"));
        assertEquals("", getClosestVowel("ab"));
        assertEquals("", getClosestVowel("ba"));
        assertEquals("", getClosestVowel("quick"));
        assertEquals("i", getClosestVowel("anime"));
        assertEquals("", getClosestVowel("Asia"));
        assertEquals("o", getClosestVowel("Above"));
    }

    @Test
    public void testGetClosestVowelEdgeCases() {
        // Check some edge cases that are easy to work out by hand.
        assertTrue(true);
    }
}