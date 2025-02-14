package com.example.python_to_java.functions_copy;
public class HumanEval_131 {
    /**
     * Given a non-negative integer n, find the product of its odd digits. If there are no odd digits, return 0.
     *
     * @param n The input integer.
     * @return The product of the odd digits of n.
     */
    public int digits(int n) {
        int product = 1;
        int odd_count = 0;
        String s = Integer.toString(n);
        for (int i = 0; i < s.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(s.charAt(i)));
            if (digit % 2 == 1) {
                product *= digit;
                odd_count++;
            }
        }
        if (odd_count == 0) {
            return 0;
        } else {
            return product;
        }
    }
}
