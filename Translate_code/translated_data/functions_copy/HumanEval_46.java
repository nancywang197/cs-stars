package com.example.python_to_java.functions_copy;
public class HumanEval_46 {
    /**
     * Given n, return the nth number in the sequence.
     * The sequence is defined as follows:
     * f(0) = 0
     * f(1) = 0
     * f(2) = 2
     * f(3) = 0
     * f(n) = f(n-1) + f(n-2) + f(n-3) + f(n-4) for n >= 4
     *
     * @param n the index of the number in the sequence
     * @return the nth number in the sequence
     */
    public int fib4(int n) {
        int[] results = {0, 0, 2, 0};
        if (n < 4) {
            return results[n];
        }

        for (int i = 4; i <= n; i++) {
            int next = results[3] + results[2] + results[1] + results[0];
            results[0] = results[1];
            results[1] = results[2];
            results[2] = results[3];
            results[3] = next;
        }

        return results[3];
    }
}
