import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class HumanEval_149 {
    /**
     * Given a list of strings, sort the list, then create a new list containing only the strings with even lengths, and finally sort the new list by string length.
     * @param lst the input list of strings
     * @return the new list of strings with even lengths, sorted by length
     */
    public List<String> sortedListSum(List<String> lst) {
        Collections.sort(lst);
        List<String> newLst = new ArrayList<>();
        for (String i : lst) {
            if (i.length() % 2 == 0) {
                newLst.add(i);
            }
        }
        Collections.sort(newLst, Comparator.comparingInt(String::length));
        return newLst;
    }
}
