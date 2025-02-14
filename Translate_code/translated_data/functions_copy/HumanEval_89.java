package com.example.python_to_java.functions_copy;
public class HumanEval_89 {
    /**
     * Encrypts a given string by shifting each lowercase letter forward by 4 positions in the alphabet, wrapping around if necessary.
     * Other characters remain unchanged.
     *
     * @param s The string to encrypt.
     * @return The encrypted string.
     */
    public String encrypt(String s) {
        String d = "abcdefghijklmnopqrstuvwxyz";
        String out = "";
        for (char c : s.toCharArray()) {
            if (d.indexOf(c) != -1) {
                out += d.charAt((d.indexOf(c) + 4) % 26);
            } else {
                out += c;
            }
        }
        return out;
    }
}
