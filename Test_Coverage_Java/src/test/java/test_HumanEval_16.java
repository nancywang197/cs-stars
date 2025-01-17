import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval16Test {

    @Test
    public void test_HumanEval_16() {
        assertEquals(0, HumanEval_16.countDistinctCharacters(""));
        assertEquals(5, HumanEval_16.countDistinctCharacters("abcde"));
        assertEquals(5, HumanEval_16.countDistinctCharacters("abcde" + "cade" + "CADE"));
        assertEquals(1, HumanEval_16.countDistinctCharacters("aaaaAAAAaaaa"));
        assertEquals(5, HumanEval_16.countDistinctCharacters("Jerry jERRY JeRRRY"));
    }
}