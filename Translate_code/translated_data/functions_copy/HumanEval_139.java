package com.example.python_to_java.functions_copy;
public class HumanEval_139 {
    /**
     * Calculates a special factorial.
     *
     * @param n The input integer.
     * @return The special factorial of n.
     */
    public long special_factorial(int n) {
        long fact_i = 1;
        long special_fact = 1;
        for (int i = 1; i <= n; i++) {
            fact_i *= i;
            special_fact *= fact_i;
        }
        return special_fact;
    }
}
