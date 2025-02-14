package com.example.python_to_java.functions_copy;
import java.util.ArrayList;
import java.util.List;

public class HumanEval_1 {
    /**
     * Given a string consisting of parentheses, separate the string into groups of balanced parentheses.
     *
     * @param paren_string The input string consisting of parentheses.
     * @return A list of strings, where each string represents a group of balanced parentheses.
     */
    public List<String> separate_paren_groups(String paren_string) {
        List<String> result = new ArrayList<>();
        List<Character> current_string = new ArrayList<>();
        int current_depth = 0;

        for (char c : paren_string.toCharArray()) {
            if (c == '(') {
                current_depth += 1;
                current_string.add(c);
            } else if (c == ')') {
                current_depth -= 1;
                current_string.add(c);

                if (current_depth == 0) {
                    StringBuilder sb = new StringBuilder();
                    for(char ch : current_string){
                        sb.append(ch);
                    }
                    result.add(sb.toString());
                    current_string.clear();
                }
            }
        }

        return result;
    }
}
