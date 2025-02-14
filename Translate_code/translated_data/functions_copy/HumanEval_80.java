package com.example.python_to_java.functions_copy;
public class HumanEval_80 {
    /**
     * Given a string s, return whether it is a happy string.
     * A happy string is a string where no two consecutive characters are the same, and no three consecutive characters are the same.
     *
     * @param s the input string
     * @return whether the string is happy
     */
    public boolean isHappy(String s) {
        if (s.length() < 3) {
            return false;
        }

        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1) || s.charAt(i + 1) == s.charAt(i + 2) || s.charAt(i) == s.charAt(i + 2)) {
                return false;
            }
        }
        return true;
    }
}
