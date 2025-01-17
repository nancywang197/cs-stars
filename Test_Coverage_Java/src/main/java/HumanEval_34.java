import java.util.*;

public class HumanEval_34 {
    public static List<Integer> unique(List<Integer> l) {
        // Convert list to set
        Set<Integer> set = new HashSet<>(l);
        
        // Convert set back to list and sort it
        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);
        
        return sortedList;
    }

    
}