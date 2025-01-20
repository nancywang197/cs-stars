import java.util.ArrayList;
import java.util.List;

class HumanEval_14 {
    /**
     * Given a string, return all its prefixes.
     *
     * @param string The input string.
     * @return A list of all prefixes of the string.
     */
    public List<String> all_prefixes(String string) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            result.add(string.substring(0, i + 1));
        }
        return result;
    }
}
