import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HumanEval_70 {
    /**
     * Given list of integers, return list in strange order.
     * Strange sorting, is when you start with the minimum value,
     * then maximum of the remaining integers, then minimum and so on.
     * Examples:
     * strange_sort_list([1, 2, 3, 4]) == [1, 4, 2, 3]
     * strange_sort_list([5, 5, 5, 5]) == [5, 5, 5, 5]
     * strange_sort_list([]) == []
     */
    public List<Integer> strange_sort_list(List<Integer> lst) {
        List<Integer> res = new ArrayList<>();
        boolean switchVar = true;
        while (!lst.isEmpty()) {
            if (switchVar) {
                int minVal = Collections.min(lst);
                res.add(minVal);
                lst.remove(Integer.valueOf(minVal));
            } else {
                int maxVal = Collections.max(lst);
                res.add(maxVal);
                lst.remove(Integer.valueOf(maxVal));
            }
            switchVar = !switchVar;
        }
        return res;
    }
}
