package com.example.python_to_java.functions_copy;
public class HumanEval_18 {
    /**
     * Given a string and a substring, return how many times the substring appears in the string.
     *
     * @param string The string to search in.
     * @param substring The substring to search for.
     * @return The number of times the substring appears in the string.
     */
    public int howManyTimes(String string, String substring) {
        int times = 0;
        for (int i = 0; i <= string.length() - substring.length(); i++) {
            if (string.substring(i, i + substring.length()).equals(substring)) {
                times++;
            }
        }
        return times;
    }
}
