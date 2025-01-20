import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HumanEval_6 {
    /**
     * Given a string consisting of nested parentheses, return a list of integers representing the maximum depth of parentheses for each group.
     *
     * @param paren_string The input string
     * @return A list of integers representing the maximum depth of parentheses for each group
     */
    public List<Integer> parse_nested_parens(String paren_string) {
        List<Integer> result = new ArrayList<>();
        String[] groups = paren_string.split(" ");
        for (String group : groups) {
            if (!group.isEmpty()) {
                result.add(parse_paren_group(group));
            }
        }
        return result;
    }

    private int parse_paren_group(String s) {
        int depth = 0;
        int max_depth = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                depth += 1;
                max_depth = Math.max(depth, max_depth);
            } else {
                depth -= 1;
            }
        }
        return max_depth;
    }
}
