package com.example.python_to_java.functions_copy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HumanEval_101 {
    /**
     * Given a string s containing words separated by commas, return a list of strings where each string is a word from the input string.
     *
     * @param s The input string.
     * @return A list of strings.
     */
    public List<String> words_string(String s) {
        if (s == null || s.isEmpty()) {
            return new ArrayList<>();
        }

        List<Character> s_list = new ArrayList<>();

        for (char letter : s.toCharArray()) {
            if (letter == ',') {
                s_list.add(' ');
            } else {
                s_list.add(letter);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : s_list) {
            sb.append(c);
        }

        String s_list_str = sb.toString();
        return Arrays.asList(s_list_str.split("\\s+"));
    }
}
