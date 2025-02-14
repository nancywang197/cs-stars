package com.example.python_to_java.functions_copy;
public class HumanEval_56 {
    /**
     * Checks if the bracketing in the input string is correct.
     *
     * @param brackets The input string containing '<' and '>' brackets.
     * @return True if the bracketing is correct, False otherwise.
     */
    public boolean correct_bracketing(String brackets) {
        int depth = 0;
        for (int i = 0; i < brackets.length(); i++) {
            char b = brackets.charAt(i);
            if (b == '<') {
                depth += 1;
            } else {
                depth -= 1;
            }
            if (depth < 0) {
                return false;
            }
        }
        return depth == 0;
    }
}
