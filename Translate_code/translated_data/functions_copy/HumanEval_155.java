package com.example.python_to_java.functions_copy;
public class HumanEval_155 {
    /**
     * Given an integer, return a tuple containing the counts of even and odd digits.
     *
     * @param num The input integer.
     * @return A tuple containing the counts of even and odd digits.
     */
    public int[] even_odd_count(int num) {
        int even_count = 0;
        int odd_count = 0;
        String s = Integer.toString(Math.abs(num));
        for (int i = 0; i < s.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(s.charAt(i)));
            if (digit % 2 == 0) {
                even_count++;
            } else {
                odd_count++;
            }
        }
        return new int[] {even_count, odd_count};
    }
}
