public class HumanEval_56 {
    public boolean correctBracketing(String brackets) {
        int depth = 0;
        for (char b : brackets.toCharArray()) {
            if (b == '<') {
                depth++;
            } else if (b == '>') {
                depth--;
            }
            if (depth < 0) {
                return false;
            }
        }
        return depth == 0;
    }

    
}