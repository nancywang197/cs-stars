package com.example.python_to_java.functions_copy;
public class HumanEval_86 {
    /**
     * Given a string s, return a string where each word in s has its letters sorted alphabetically.
     *
     * @param s The input string.
     * @return The string with each word's letters sorted alphabetically.
     */
    public String anti_shuffle(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            char[] chars = word.toCharArray();
            java.util.Arrays.sort(chars);
            result.append(new String(chars)).append(" ");
        }
        return result.toString().trim();
    }
}
