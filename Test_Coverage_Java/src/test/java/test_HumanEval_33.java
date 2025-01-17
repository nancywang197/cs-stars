import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval33Test {

    @Test
    public void test_HumanEval_33() {
        int[] inputArray1 = {1, 2, 3};
        int[] expectedOutput1 = {1, 2, 3};

        int[] output1 = sortThird(inputArray1);
        assertArrayEquals(expectedOutput1, output1);

        int[] inputArray2 = {5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10};
        int[] expectedOutput2 = {5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10};

        int[] output2 = sortThird(inputArray2);
        assertArrayEquals(expectedOutput2, output2);

        int[] inputArray3 = {5, 8, -12, 4, 23, 2, 3, 11, 12, -10};
        int[] expectedOutput3 = {5, 8, -12, 4, 23, 2, 3, 11, 12, -10};

        int[] output3 = sortThird(inputArray3);
        assertArrayEquals(expectedOutput3, output3);

        int[] inputArray4 = {5, 6, 3, 4, 8, 9, 2};
        int[] expectedOutput4 = {2, 6, 3, 4, 8, 9, 5};

        int[] output4 = sortThird(inputArray4);
        assertArrayEquals(expectedOutput4, output4);

        int[] inputArray5 = {5, 8, 3, 4, 6, 9, 2};
        int[] expectedOutput5 = {2, 8, 3, 4, 6, 9, 5};

        int[] output5 = sortThird(inputArray5);
        assertArrayEquals(expectedOutput5, output5);

        int[] inputArray6 = {5, 6, 9, 4, 8, 3, 2};
        int[] expectedOutput6 = {2, 6, 9, 4, 8, 3, 5};

        int[] output6 = sortThird(inputArray6);
        assertArrayEquals(expectedOutput6, output6);

        int[] inputArray7 = {5, 6, 3, 4, 8, 9, 2, 1};
        int[] expectedOutput7 = {2, 6, 3, 4, 8, 9, 5, 1};

        int[] output7 = sortThird(inputArray7);
        assertArrayEquals(expectedOutput7, output7);

    }

    public static int[] sortThird(int[] arr) {
        // implementation of the sort_third method
        // for example:
        Arrays.sort(arr);
        int third = arr[arr.length - 3];
        return Arrays.copyOfRange(arr, 0, arr.length - 3).concat(Arrays.asList(third)).toArray();
    }
}