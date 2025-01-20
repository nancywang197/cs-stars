import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class HumanEval_120 {
    /**
     * Given an array of integers and a positive integer k, return the k largest elements in the array.
     *
     * @param arr The input array of integers.
     * @param k The number of largest elements to return.
     * @return A list containing the k largest elements in the array.  Returns an empty list if k is 0.
     */
    public List<Integer> maximum(List<Integer> arr, int k) {
        if (k == 0) {
            return new ArrayList<>();
        }
        Collections.sort(arr);
        List<Integer> ans = arr.subList(arr.size() - k, arr.size());
        return new ArrayList<>(ans);
    }
}
