package com.example.python_to_java.functions_copy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HumanEval_117 {
    /**
     * Given a string s and an integer n, return a list of words from s that have exactly n consonants.
     *
     * @param s The input string.
     * @param n The number of consonants.
     * @return A list of words that have exactly n consonants.
     */
    public List<String> selectWords(String s, int n) {
        List<String> result = new ArrayList<>();
        String[] words = s.split("\\s+"); //splits by whitespace
        for (String word : words) {
            int n_consonants = 0;
            for (int i = 0; i < word.length(); i++) {
                char c = Character.toLowerCase(word.charAt(i));
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                    n_consonants++;
                }
            }
            if (n_consonants == n) {
                result.add(word);
            }
        }
        return result;
    }
}
