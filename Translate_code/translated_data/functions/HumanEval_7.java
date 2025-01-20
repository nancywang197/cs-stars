import java.util.ArrayList;
import java.util.List;

class HumanEval_7 {
    /**
     * Given a list of strings and a substring, return a new list containing only the strings that contain the substring.
     *
     * @param strings The list of strings to filter.
     * @param substring The substring to search for.
     * @return A new list containing only the strings that contain the substring.
     */
    public List<String> filterBySubstring(List<String> strings, String substring) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            if (str.contains(substring)) {
                result.add(str);
            }
        }
        return result;
    }
}
