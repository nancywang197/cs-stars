import java.util.Arrays;
import java.util.List;

public class HumanEval_6 {

    public static List<Integer> parseNestedParens(String parenString) {
        String[] groups = parenString.split("\\s+");
        
        List<Integer> result = new ArrayList<>();
        for (String group : groups) {
            int maxDepth = 0;
            int currentDepth = 0;
            
            for (char c : group.toCharArray()) {
                if (c == '(') {
                    currentDepth++;
                    maxDepth = Math.max(maxDepth, currentDepth);
                } else if (c == ')') {
                    currentDepth--;
                }
            }

            result.add(maxDepth);
        }

        return result;
    }

    
}