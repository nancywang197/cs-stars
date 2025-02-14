package com.example.python_to_java.functions_copy;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HumanEval_91 {
    /**
     * Counts the number of sentences in a string that start with "I ".
     *
     * @param S The input string.
     * @return The number of sentences starting with "I ".
     */
    public int is_bored(String S) {
        Pattern pattern = Pattern.compile("[.?!]\\s*");
        String[] sentences = pattern.split(S);
        int count = 0;
        for (String sentence : sentences) {
            if (sentence.length() >= 2 && sentence.substring(0, 2).equals("I ")) {
                count++;
            }
        }
        return count;
    }
}
