import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HumanEval_68 {
    /**
     * Given an array of integers, return a list containing the minimum even number in the array and its index.
     * If the array is empty or contains no even numbers, return an empty list.
     *
     * @param arr The input array of integers.
     * @return A list containing the minimum even number and its index, or an empty list if no even numbers are found.
     */
    public List<Integer> pluck(int[] arr) {
        if (arr.length == 0) {
            return new ArrayList<>();
        }

        List<Integer> evens = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0) {
                evens.add(num);
            }
        }

        if (evens.isEmpty()) {
            return new ArrayList<>();
        }

        int minEven = evens.get(0);
        for (int i = 1; i < evens.size(); i++) {
            if (evens.get(i) < minEven) {
                minEven = evens.get(i);
            }
        }

        int minEvenIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == minEven) {
                minEvenIndex = i;
                break;
            }
        }

        return Arrays.asList(minEven, minEvenIndex);
    }
}
