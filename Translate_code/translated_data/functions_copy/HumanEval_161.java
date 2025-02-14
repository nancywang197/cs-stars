package com.example.python_to_java.functions_copy;
public class HumanEval_161 {
    /**
     * Given a string s, if it contains any alphabet, convert all alphabets to opposite case.
     * Otherwise, reverse the string.
     *
     * @param s input string
     * @return the result string
     */
    public String solve(String s) {
        int flg = 0;
        int idx = 0;
        char[] new_str = s.toCharArray();
        for (char i : s.toCharArray()) {
            if (Character.isLetter(i)) {
                new_str[idx] = Character.isUpperCase(i) ? Character.toLowerCase(i) : Character.toUpperCase(i);
                flg = 1;
            }
            idx += 1;
        }
        String res = "";
        for (char i : new_str) {
            res += i;
        }
        if (flg == 0) {
            return new StringBuilder(res).reverse().toString();
        }
        return res;
    }
}
