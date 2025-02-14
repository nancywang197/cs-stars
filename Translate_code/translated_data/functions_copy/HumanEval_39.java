package com.example.python_to_java.functions_copy;
import java.util.List;
import java.util.ArrayList;
public class HumanEval_39 {
    /**
     * Given an integer n, return the nth prime Fibonacci number.
     *
     * @param n the number of prime Fibonacci numbers to find
     * @return the nth prime Fibonacci number
     */
    public int prime_fib(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer.");
        }
        List<Integer> f = new ArrayList<>();
        f.add(0);
        f.add(1);
        while (true) {
            int nextFib = f.get(f.size() - 1) + f.get(f.size() - 2);
            f.add(nextFib);
            if (isPrime(nextFib)) {
                n--;
            }
            if (n == 0) {
                return nextFib;
            }
        }
    }

    private boolean isPrime(int p) {
        if (p < 2) {
            return false;
        }
        for (int k = 2; k <= Math.min((int) Math.sqrt(p) + 1, p - 1); k++) {
            if (p % k == 0) {
                return false;
            }
        }
        return true;
    }
}
