package com.example.python_to_java.functions_copy;
import java.util.List;
import java.util.ArrayList;
public class HumanEval_119 {
    /**
     * You are given a list of two strings, both strings consist of open
     * parentheses '(' or close parentheses ')' only.
     * Your job is to check if it is possible to concatenate the two strings in
     * some order, that the resulting string will be good.
     * A string S is considered to be good if and only if all parentheses in S
     * are balanced. For example: the string '(())()' is good, while the string
     * '())' is not.
     * Return 'Yes' if there's a way to make a good string, and return 'No' otherwise.
     * Examples:
     * match_parens(['()(', ')']) == 'Yes'
     * match_parens([')', ')']) == 'No'
     */
    public String match_parens(String[] lst) {
        boolean check = checkString(lst[0] + lst[1]) || checkString(lst[1] + lst[0]);
        return check ? "Yes" : "No";
    }

    private boolean checkString(String s) {
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                val++;
            } else {
                val--;
            }
            if (val < 0) {
                return false;
            }
        }
        return val == 0;
    }
}
