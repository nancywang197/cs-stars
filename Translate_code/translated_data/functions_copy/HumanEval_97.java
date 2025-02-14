package com.example.python_to_java.functions_copy;
public class HumanEval_97 {
    /**
     * Given two integers a and b, return the absolute value of the product of the last digit of a and the last digit of b.
     * @param a the first integer
     * @param b the second integer
     * @return the absolute value of the product of the last digit of a and the last digit of b
     */
    public int multiply(int a, int b) {
        return Math.abs(Math.abs(a % 10) * Math.abs(b % 10));
    }
}
