import java.util.List;
import java.util.Optional;

class HumanEval_12 {
    /**
     * Given a list of strings, return the longest string.
     * If the list is empty, return None.
     * If there are multiple strings with the same maximum length, return the first one.
     *
     * @param strings The list of strings
     * @return The longest string
     */
    public String longest(List<String> strings) {
        if (strings == null || strings.isEmpty()) {
            return null;
        }

        int maxlen = 0;
        for (String s : strings) {
            if (s.length() > maxlen) {
                maxlen = s.length();
            }
        }

        for (String s : strings) {
            if (s.length() == maxlen) {
                return s;
            }
        }
        return null; //Should not reach here, but added for completeness.

    }
}
