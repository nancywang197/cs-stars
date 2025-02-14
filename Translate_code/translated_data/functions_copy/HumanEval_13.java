package com.example.python_to_java.functions_copy;
public class HumanEval_13 {
    /**
     * Given two integers a and b, return their greatest common divisor.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the greatest common divisor of a and b
     */
    public int greatest_common_divisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
