import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class HumanEval_34Test {

    @Test
    public void test_HumanEval_34() {
        int[] result = unique(new int[]{5, 3, 5, 2, 3, 3, 9, 0, 123});
        int[] expected = {0, 2, 3, 5, 9, 123};
        assertArrayEquals(expected, result);
    }
}