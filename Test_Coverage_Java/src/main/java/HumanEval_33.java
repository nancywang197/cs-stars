import java.util.Arrays;

public class HumanEval_33 {
    public static int[] sortThird(int[] arr) {
        // Create a copy of the input array to avoid modifying it in-place.
        int[] arrCopy = Arrays.copyOf(arr, arr.length);

        // Sort every third element in the array.
        for (int i = 0; i < arrCopy.length - 2; i += 3) {
            Arrays.sort(Arrays.copyOfRange(arrCopy, i, i + 3));
        }

        return arrCopy;
    }
}