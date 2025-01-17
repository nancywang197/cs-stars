import java.util.HashMap;
import java.util.Map;

public class Main {

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

    ;
        System.out.println(isSorted(arr1));  // prints: true

        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr2));  // prints: true

        int[] arr3 = {1, 3, 2, 4, 5};
        System.out.println(isSorted(arr3));  // prints: false

        int[] arr4 = {1, 2, 3, 4, 5, 6};
        System.out.println(isSorted(arr4));  // prints: true

        int[] arr5 = {1, 3, 2, 4, 5, 6, 7};
        System.out.println(isSorted(arr5));  // prints: true

        int[] arr6 = {1, 3, 2, 4, 5, 6, 7};
        System.out.println(isSorted(arr6));  // prints: false

        int[] arr7 = {1, 2, 2, 3, 3, 4};
        System.out.println(isSorted(arr7));  // prints: true

        int[] arr8 = {1, 2, 2, 2, 3, 4};
        System.out.println(isSorted(arr8));  // prints: false
    }
}