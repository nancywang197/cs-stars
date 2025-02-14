package com.example.python_to_java.functions_copy;
public class HumanEval_76 {
    /**
     * Checks if x is a power of n.
     * @param x The number to check.
     * @param n The base.
     * @return True if x is a power of n, False otherwise.
     */
    public boolean isSimplePower(int x, int n) {
        if (n == 1) {
            return x == 1;
        }
        int power = 1;
        while (power < x) {
            power = power * n;
        }
        return power == x;
    }
}
