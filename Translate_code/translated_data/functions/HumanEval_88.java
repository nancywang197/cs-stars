import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class HumanEval_88 {
    /**
     * Sorts an array in ascending or descending order based on the sum of the first and last elements.
     *
     * @param array The input array of integers.
     * @return A new array sorted in ascending order if the sum of the first and last elements is odd, and in descending order if it is even. Returns an empty array if the input array is empty.
     */
    public List<Integer> sort_array(List<Integer> array) {
        if (array.isEmpty()) {
            return new ArrayList<>();
        } else {
            int sum = array.get(0) + array.get(array.size() - 1);
            if (sum % 2 == 0) {
                Collections.sort(array, Collections.reverseOrder());
            } else {
                Collections.sort(array);
            }
            return array;
        }
    }
}
