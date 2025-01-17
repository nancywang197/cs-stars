import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HumanEval_9Test {

    @Test
    public void test_HumanEval_9_EmptyList_ReturnsEmptyList() {
        HumanEval_9 rollingMax = new HumanEval_9();
        assertArrayEquals(new int[0], rollingMax.rollingMax([]));
    }

    @Test
    public void test_HumanEval_9_SimpleCase_ReturnsOriginalSequence() {
        HumanEval_9 rollingMax = new HumanEvall_9();
        int[] input = {1, 2, 3, 4};
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, rollingMax.rollingMax(input));
    }

    @Test
    public void test_HumanEval_9_DescendingSequence_ReturnsRepeatingHighestNumber() {
        HumanEval_9 rollingMax = new HumanEval_9();
        int[] input = {4, 3, 2, 1};
        int[] expected = {4, 4, 4, 4};
        assertArrayEquals(expected, rollingMax.rollingMax(input));
    }

    @Test
    public void test_HumanEval_9_MixedCase_ReturnsHighestNumber() {
        HumanEval_9 rollingMax = new HumanEvall_9();
        int[] input = {3, 2, 3, 100, 3};
        int[] expected = {3, 3, 3, 100, 100};
        assertArrayEquals(expected, rollingMax.rollingMax(input));
    }
}