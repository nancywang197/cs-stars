package com.example.python_to_java.functions_copy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HumanEval_123 {
    /**
     * Given a number n, return a sorted list of odd numbers encountered during the Collatz sequence.
     * If n is even, return an empty list.
     *
     * @param n the starting number
     * @return a sorted list of odd numbers encountered during the Collatz sequence
     */
    public List<Integer> get_odd_collatz(int n) {
        List<Integer> odd_collatz = new ArrayList<>();
        if (n % 2 == 0) {
            return odd_collatz;
        } else {
            odd_collatz.add(n);
        }
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            if (n % 2 == 1) {
                odd_collatz.add(n);
            }
        }
        Collections.sort(odd_collatz);
        return odd_collatz;
    }
}
