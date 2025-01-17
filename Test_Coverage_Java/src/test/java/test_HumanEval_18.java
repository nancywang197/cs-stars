import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval18Test {

    @Test
    public void test_HumanEval_18_EmptyString() {
        assertEquals(0, howManyTimes("", "x"));
    }

    @Test
    public void test_HumanEval_18_SingleCharacterPattern() {
        assertEquals(4, howManyTimes("xyxyxyx", "x"));
    }

    @Test
    public void test_HumanEval_18_DuplicateCharactersInPattern() {
        assertEquals(4, howManyTimes("cacacacac", "cac"));
    }

    @Test
    public void test_HumanEval_18_SingleCharacterString() {
        assertEquals(1, howManyTimes("john doe", "john"));
    }
}