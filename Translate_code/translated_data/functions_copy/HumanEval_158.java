package com.example.python_to_java.functions_copy;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class HumanEval_158 {
    /**
     * Given a list of strings, find the string with the maximum number of unique characters.
     * If multiple strings have the same maximum number of unique characters, return the lexicographically smallest string.
     *
     * @param words The list of strings.
     * @return The string with the maximum number of unique characters.
     */
    public String find_max(String[] words) {
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                Set<Character> setA = new HashSet<>();
                for (char c : a.toCharArray()) {
                    setA.add(c);
                }
                Set<Character> setB = new HashSet<>();
                for (char c : b.toCharArray()) {
                    setB.add(c);
                }
                int lenA = setA.size();
                int lenB = setB.size();
                if (lenA != lenB) {
                    return lenB - lenA; //descending order by unique char count

                } else {
                    return a.compareTo(b); //ascending order lexicographically
                }
            }
        });
        return words[0];
    }
}
