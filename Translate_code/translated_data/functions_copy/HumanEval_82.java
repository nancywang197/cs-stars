package com.example.python_to_java.functions_copy;
public class HumanEval_82 {
    /**
     * Given a string, determine if its length is a prime number.
     *
     * @param string The input string.
     * @return True if the length of the string is a prime number, False otherwise.
     */
    public boolean prime_length(String string) {
        int l = string.length();
        if (l == 0 || l == 1) {
            return false;
        }
        for (int i = 2; i < l; i++) {
            if (l % i == 0) {
                return false;
            }
        }
        return true;
    }
}
