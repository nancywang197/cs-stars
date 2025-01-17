import java.util.*;

public class Main {
    /**
     * Given list of integers, return list in strange order.
     * Strange sorting, is when you start with the minimum value,
     * then maximum of the remaining integers, then minimum and so on.
     *
     * @param lst List of integers
     * @return List of integers in strange order
     */
    public static List<Integer> strangeSortList(List<Integer> lst) {
        List<Integer> result = new ArrayList<>();
        boolean switcher = true;
        
        while (lst.size() > 0) {
            // Use Math.min and Math.max if Java 8 or later
            // Otherwise, use Arrays.stream().min() and Arrays.stream().max()
            result.add(switcher ? Collections.min(lst) : Collections.max(lst));
            lst.remove((Integer) result.get(result.size() - 1));
            switcher = !switcher;
        }
        
        return result;
    }

    
}