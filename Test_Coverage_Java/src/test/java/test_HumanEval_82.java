import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HumanEval82Test {

    @Test
    void test_HumanEval_82() {
        // Check some simple cases
        assertTrue(HumanEval_82.isPrimeLength("Hello"));
        assertTrue(HumanEval_82.isPrimeLength("abcdcba"));
        assertTrue(HumanEval_82.isPrimeLength("kittens"));
        assertFalse(HumanEval_82.isPrimeLength("orange"));
        assertTrue(HumanEval_82.isPrimeLength("wow"));
        assertTrue(HumanEval_82.isPrimeLength("world"));
        assertTrue(HumanEval_82.isPrimeLength("MadaM"));
        assertTrue(HumanEval_82.isPrimeLength("Wow"));
        assertFalse(HumanEval_82.isPrimeLength(""));
        assertTrue(HumanEval_82.isPrimeLength("HI"));
        assertTrue(HumanEval_82.isPrimeLength("go"));
        assertFalse(HumanEval_82.isPrimeLength("gogo"));
        assertFalse(HumanEval_82.isPrimeLength("aaaaaaaaaaaaaaa"));

        // Check some edge cases that are easy to work out by hand.
        assertTrue(HumanEval_82.isPrimeLength("Madam"));
        assertFalse(HumanEval_82.isPrimeLength("M"));
        assertFalse(HumanEval_82.isPrimeLength("0"));
    }
}