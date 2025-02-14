package com.example.python_to_java.functions_copy;
import java.util.Set;
import java.util.HashSet;
public class HumanEval_54 {
    /**
     * Given two strings, determine if they have the same characters.
     *
     * @param s0 The first string.
     * @param s1 The second string.
     * @return True if the strings have the same characters, False otherwise.
     */
    public boolean sameChars(String s0, String s1) {
        Set<Character> set0 = new HashSet<>();
        for (char c : s0.toCharArray()) {
            set0.add(c);
        }
        Set<Character> set1 = new HashSet<>();
        for (char c : s1.toCharArray()) {
            set1.add(c);
        }
        return set0.equals(set1);
    }
}
