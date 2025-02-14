package com.example.python_to_java.functions_copy;
public class HumanEval_65 {
    /**
     * Given an integer x and an integer shift, perform a circular shift on the digits of x.
     * If shift is greater than the number of digits in x, reverse x.
     * Otherwise, shift the last shift digits of x to the beginning.
     *
     * @param x     The integer to shift.
     * @param shift The number of digits to shift.
     * @return The shifted integer.
     */
    public String circular_shift(int x, int shift) {
        String s = Integer.toString(x);
        if (shift > s.length()) {
            String reversed = new StringBuilder(s).reverse().toString();
            return reversed;

        } else {
            String shifted = s.substring(s.length() - shift) + s.substring(0, s.length() - shift);
            return shifted;
        }
    }
}
