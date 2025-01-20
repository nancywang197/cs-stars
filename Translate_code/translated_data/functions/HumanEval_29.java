import java.util.ArrayList;
import java.util.List;

class HumanEval_29 {
    /**
     * Given a list of strings and a prefix, return a new list containing only the strings that start with the given prefix.
     *
     * @param strings The list of strings to filter.
     * @param prefix  The prefix to filter by.
     * @return A new list containing only the strings that start with the given prefix.
     */
    public List<String> filterByPrefix(List<String> strings, String prefix) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            if (str.startsWith(prefix)) {
                result.add(str);
            }
        }
        return result;
    }
}
