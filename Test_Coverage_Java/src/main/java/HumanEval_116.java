import java.util.Arrays;
import java.util.Comparator;

public class Main {

    ;
        int[] sortedArr = sortArray(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    /**
     * Sorts an array of integers based on the number of '1' bits in their binary representation.
     *
     * @param arr The input array to be sorted
     * @return A new array with elements sorted by the number of '1' bits in their binary representation
     */
    public static int[] sortArray(int[] arr) {
        Arrays.sort(arr, (a, b) -> Integer.bitCount(a) - Integer.bitCount(b));
        return arr;
    }
}