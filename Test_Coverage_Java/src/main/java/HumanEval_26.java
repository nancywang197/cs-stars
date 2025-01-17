import java.util.*;

public class Main {
    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        Map<Integer, Integer> counter = new HashMap<>();
        
        // Count occurrences of each number
        for (Integer num : numbers) {
            if (!counter.containsKey(num)) {
                counter.put(num, 1);
            } else {
                counter.put(num, counter.get(num) + 1);
            }
        }

        List<Integer> result = new ArrayList<>();
        // Add unique numbers to the list
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

    
}