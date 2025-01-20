import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HumanEval_33 {
    /**
     * Sorts every third element of a list.
     *
     * @param l The input list.
     * @return The list with every third element sorted.
     */
    public List<Integer> sort_third(List<Integer> l) {
        List<Integer> list = new ArrayList<>(l);
        List<Integer> sublist = new ArrayList<>();
        for (int i = 0; i < list.size(); i += 3) {
            sublist.add(list.get(i));
        }
        Collections.sort(sublist);
        int k = 0;
        for (int i = 0; i < list.size(); i += 3) {
            list.set(i, sublist.get(k++));
        }
        return list;
    }
}
