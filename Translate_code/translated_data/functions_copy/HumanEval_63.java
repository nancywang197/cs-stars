package com.example.python_to_java.functions_copy;
public class HumanEval_63 {
    /**
     * Given n, calculate F(n) = F(n-1) + F(n-2) + F(n-3) for n >= 3
     * F(0) = 0
     * F(1) = 0
     * F(2) = 1
     * @param n
     * @return
     */
    public int fibfib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fibfib(n - 1) + fibfib(n - 2) + fibfib(n - 3);
    }
}
