import java.util.HashMap;
import java.util.Map;

public class HumanEval_126 {

    public static boolean isSorted(int[] arr) {
        // Check for duplicates (more than 2 of same number)
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        return !countMap.values().stream().anyMatch(value -> value > 2);

        // Check for ascending order
        // if all elements are in order from smallest to largest
        return Arrays.stream(arr).sorted().toArray()
                .equals(arr); 
    }

}