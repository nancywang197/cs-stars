package com.example.python_to_java.functions_copy;
import java.util.List;
import java.util.ArrayList;
public class HumanEval_94 {
    /**
     * Given a list of integers, find the largest prime number in the list and return the sum of its digits.
     *
     * @param lst The list of integers.
     * @return The sum of the digits of the largest prime number in the list.
     */
    public int skjkasdkd(int[] lst) {
        int maxx = 0;
        int i = 0;
        while (i < lst.length) {
            if (lst[i] > maxx && isPrime(lst[i])) {
                maxx = lst[i];
            }
            i++;
        }
        int result = 0;
        String s = Integer.toString(maxx);
        for (int j = 0; j < s.length(); j++) {
            result += Integer.parseInt(String.valueOf(s.charAt(j)));
        }
        return result;
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
