package com.example.python_to_java.functions_copy;
import java.util.List;
import java.util.ArrayList;
public class HumanEval_125 {
    /**
     * Given a string of words, return a list of words split on whitespace, if no whitespaces exists in the text you
     * should split on commas ',' if no commas exists you should return the number of lower-case letters with odd order in the
     * alphabet, ord('a') = 0, ord('b') = 1, ... ord('z') = 25
     * Examples
     * split_words("Hello world!") -> ["Hello", "world!"]
     * split_words("Hello,world!") -> ["Hello", "world!"]
     * split_words("abcdef") == 3
     */
    public Object split_words(String txt) {
        if (txt.contains(" ")) {
            return txt.split("\\s+");
        } else if (txt.contains(",")) {
            return txt.replace(",", " ").split("\\s+");
        } else {
            int count = 0;
            for (int i = 0; i < txt.length(); i++) {
                char c = txt.charAt(i);
                if (Character.isLowerCase(c) && (c - 'a') % 2 == 0) {
                    count++;
                }
            }
            return count;
        }
    }
}
