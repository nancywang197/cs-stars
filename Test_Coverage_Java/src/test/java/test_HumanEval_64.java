import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_64Test {

    @Test
    public void test_HumanEval_64() {
 
        // Check some simple cases
        assertEquals(2, HumanEval_64.vowels_count("abcde"), "Test 1");
        assertEquals(3, HumanEval_64.vowels_count("Alone"), "Test 2");
        assertEquals(2, HumanEval_64.vowels_count("key"), "Test 3");
        assertEquals(1, HumanEval_64.vowels_count("bye"), "Test 4");
        assertEquals(2, HumanEval_64.vowels_count("keY"), "Test 5");
        assertEquals(1, HumanEval_64.vowels_count("bYe"), "Test 6");
        assertEquals(3, HumanEval_64.vowels_count("ACEDY"), "Test 7");
 
        // Check some edge cases that are easy to work out by hand.
        assertTrue(true);
    }
}