import java.util.Stack;

public class HumanEval_132 {

    public static boolean isNested(String s) {
        Stack<Integer> openingBrackets = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                openingBrackets.push(i);
            } else if (s.charAt(i) == ']') {
                if (openingBrackets.isEmpty()) {
                    return false;
                }
                int openingBracketIndex = openingBrackets.pop();
                if (openingBracketIndex < i) {
                    return true;
                }
            }
        }
        return false;
    }

    
}