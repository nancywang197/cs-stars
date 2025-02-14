package com.example.python_to_java.functions_copy;
import java.util.HashSet;
import java.util.Set;

public class HumanEval_16 {
    /**
     * Given a string, find the number of distinct characters in the string.
     *
     * @param string The input string.
     * @return The number of distinct characters in the string.
     */
    public int count_distinct_characters(String string) {
        Set<Character> distinctChars = new HashSet<>();
        for (char c : string.toLowerCase().toCharArray()) {
            distinctChars.add(c);
        }
        return distinctChars.size();
    }
}
