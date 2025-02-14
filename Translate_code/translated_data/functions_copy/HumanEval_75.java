package com.example.python_to_java.functions_copy;
public class HumanEval_75 {
    /**
     * Given a number a, determine if it can be expressed as the product of three prime numbers.
     *
     * @param a the number to check
     * @return true if a can be expressed as the product of three prime numbers, false otherwise
     */
    public boolean isMultiplyPrime(int a) {
        for (int i = 2; i <= 100; i++) {
            if (!isPrime(i)) continue;
            for (int j = 2; j <= 100; j++) {
                if (!isPrime(j)) continue;
                for (int k = 2; k <= 100; k++) {
                    if (!isPrime(k)) continue;
                    if (i * j * k == a) return true;
                }
            }
        }
        return false;
    }

    private boolean isPrime(int n) {
        for (int j = 2; j < n; j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }
}
