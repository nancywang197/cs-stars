import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval5Test {

    @Test
    public void test_HumanEval_5_EmptyArray() {
        int[] input = new int[0];
        int expected = 7;
        int actual = HumanEval_5.intersperse(input, expected);
        assertEquals(expected, actual);
    }

    @Test
    public void test_HumanEval_5_SingleElementArray() {
        int[] input = {5, 6, 3, 2};
        int expected = 8;
        int actual = HumanEval_5.intersperse(input, expected);
        assertArrayEquals(java.util.Arrays.asList(expected), java.util.Arrays.asList(actual));
    }

    @Test
    public void test_HumanEval_5_MultipleElementArray() {
        int[] input = {2, 2, 2};
        int expected = 2;
        int actual = HumanEval_5.intersperse(input, expected);
        assertArrayEquals(java.util.Arrays.asList(expected), java.util.Arrays.asList(actual));
    }
}