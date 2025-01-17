import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class HumanEval_62Test {

    @Test
    public void test_HumanEval_62() {
        int[] input1 = {3, 1, 2, 4, 5};
        int[] expectedOutput1 = {1, 4, 12, 20};

        assertArrayEquals(expectedOutput1, HumanEval_62.derivative(input1));

        int[] input2 = {1, 2, 3};
        int[] expectedOutput2 = {2, 6};

        assertArrayEquals(expectedOutput2, HumanEval_62.derivative(input2));

        int[] input3 = {3, 2, 1};
        int[] expectedOutput3 = {2, 2};

        assertArrayEquals(expectedOutput3, HumanEval_62.derivative(input3));

        int[] input4 = {3, 2, 1, 0, 4};
        int[] expectedOutput4 = {2, 2, 0, 16};

        assertArrayEquals(expectedOutput4, HumanEval_62.derivative(input4));

        int[] input5 = {1};
        int[] expectedOutput5 = {};

        assertArrayEquals(expectedOutput5, HumanEval_62.derivative(input5));
    }
}