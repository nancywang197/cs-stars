import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HumanEval30Test {

    @Test
    public void testGetPositive() {
        int[] input1 = {-1, -2, 4, 5, 6};
        int[] expectedOutput1 = {4, 5, 6};
        assertArrayEquals(expectedOutput1, getPositive(input1));

        int[] input2 = {5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10};
        int[] expectedOutput2 = {5, 3, 2, 3, 3, 9, 123, 1};
        assertArrayEquals(expectedOutput2, getPositive(input2));

        int[] input3 = {-1, -2};
        int[] expectedOutput3 = {};
        assertArrayEquals(expectedOutput3, getPositive(input3));

        int[] input4 = {};
        int[] expectedOutput4 = {};
        assertArrayEquals(expectedOutput4, getPositive(input4));
    }

    // Assuming this method is in a class called HumanEval
    public static int[] getPositive(int[] numbers) {
        // This function logic should be implemented here.
        // For demonstration purposes, it will simply filter positive numbers from the input array.
        int count = 0;
        for (int num : numbers) {
            if (num > 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int num : numbers) {
            if (num > 0) {
                result[index++] = num;
            }
        }
        return result;
    }
}