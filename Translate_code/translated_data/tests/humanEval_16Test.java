import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_16Test {

    HumanEval_16 counter = new HumanEval_16();

    @Test
    public void testEmpty() {
        assertEquals(0, counter.count_distinct_characters(""));
    }

    @Test
    public void testAbcde() {
        assertEquals(5, counter.count_distinct_characters("abcde"));
    }

    @Test
    public void testAbcdeCadeCADE() {
        assertEquals(5, counter.count_distinct_characters("abcde" + "cade" + "CADE"));
    }

    @Test
    public void testAaaaAAAAaaaa() {
        assertEquals(1, counter.count_distinct_characters("aaaaAAAAaaaa"));
    }

    @Test
    public void testJerryjERRYJeRRRY() {
        assertEquals(5, counter.count_distinct_characters("Jerry jERRY JeRRRY"));
    }
}
