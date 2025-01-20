import java.util.Arrays;
import java.util.Comparator;

class HumanEval_116 {
    /**
     * Sorts an array of integers first in ascending order, then by the number of 1s in their binary representation.
     *
     * @param arr The input array of integers.
     * @return The sorted array.
     */
    public int[] sort_array(int[] arr) {
        Arrays.sort(arr);
        Arrays.sort(arr, Comparator.comparingInt(x -> Integer.toBinaryString(x).replace("0","").length()));
        return arr;
    }
}
