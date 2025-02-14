package com.example.python_to_java.functions_copy;
import java.util.List;
import java.util.ArrayList;
public class HumanEval_36 {
    /**
     * Given an integer n, return the number of times the digit 7 appears in the string representation of the numbers that are multiples of 11 or 13 less than n.
     *
     * @param n the input integer
     * @return the number of times the digit 7 appears
     */
    public int fizz_buzz(int n) {
        List<Integer> ns = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i % 11 == 0 || i % 13 == 0) {
                ns.add(i);
            }
        }
        StringBuilder s = new StringBuilder();
        for (int num : ns) {
            s.append(num);
        }
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '7') {
                ans++;
            }
        }
        return ans;
    }
}
