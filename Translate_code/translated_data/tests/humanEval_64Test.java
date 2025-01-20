import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_64Test {

    @Test
    public void testVowelsCount() {
        HumanEval_64 humanEval_64 = new HumanEval_64();
        assertEquals(humanEval_64.vowels_count("abcde"), 2);
        assertEquals(humanEval_64.vowels_count("Alone"), 3);
        assertEquals(humanEval_64.vowels_count("key"), 2);
        assertEquals(humanEval_64.vowels_count("bye"), 1);
        assertEquals(humanEval_64.vowels_count("keY"), 2);
        assertEquals(humanEval_64.vowels_count("bYe"), 1);
        assertEquals(humanEval_64.vowels_count("ACEDY"), 3);
    }
}
