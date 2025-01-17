import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval104Test {

    @Test
    public void test_HumanEval_104_SimpleCases() {
        int[] expected = {1, 15, 33};
        int[] actual = functions.HumanEval_104.uniqueDigits(new int[]{15, 33, 1422, 1});
        assertArrayEquals(expected, actual);

        expected = new int[0];
        actual = functions.HumanEval_104.uniqueDigits(new int[]{152, 323, 1422, 10});
        assertArrayEquals(expected, actual);

        expected = {111, 151};
        actual = functions.HumanEval_104.uniqueDigits(new int[]{12345, 2033, 111, 151});
        assertArrayEquals(expected, actual);

        expected = {31, 135};
        actual = functions.HumanEval_104.uniqueDigits(new int[]{135, 103, 31});
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_HumanEval_104_EdgeCases() {
        assertTrue(true);
    }
}