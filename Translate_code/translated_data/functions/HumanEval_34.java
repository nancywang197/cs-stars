import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class HumanEval_34 {
    /**
     * Given a list l, return a sorted list containing only the unique elements of l.
     * @param l The input list.
     * @return A sorted list containing only the unique elements of l.
     */
    public List<Integer> unique(List<Integer> l) {
        Set<Integer> uniqueElements = new HashSet<>(l);
        List<Integer> sortedList = new ArrayList<>(uniqueElements);
        java.util.Collections.sort(sortedList);
        return sortedList;
    }
}
