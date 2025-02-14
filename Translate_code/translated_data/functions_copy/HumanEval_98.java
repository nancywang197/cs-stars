package com.example.python_to_java.functions_copy;
public class HumanEval_98 {
    /**
     * Given a string s, count the number of uppercase vowels in the string at even indices.
     *
     * @param s the input string
     * @return the number of uppercase vowels in the string at even indices
     */
    public int count_upper(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i += 2) {
            char c = s.charAt(i);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                count++;
            }
        }
        return count;
    }
}
