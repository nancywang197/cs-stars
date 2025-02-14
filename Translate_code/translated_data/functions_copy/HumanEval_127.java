package com.example.python_to_java.functions_copy;
public class HumanEval_127 {
    /**
     * Given two intervals, find the intersection of the intervals.
     * If the length of the intersection is a prime number, return "YES". Otherwise, return "NO".
     *
     * @param interval1 The first interval.
     * @param interval2 The second interval.
     * @return "YES" if the length of the intersection is a prime number, "NO" otherwise.
     */
    public String intersection(int[] interval1, int[] interval2) {
        int l = Math.max(interval1[0], interval2[0]);
        int r = Math.min(interval1[1], interval2[1]);
        int length = r - l;
        if (length > 0 && isPrime(length)) {
            return "YES";
        }
        return "NO";
    }

    private boolean isPrime(int num) {
        if (num == 1 || num == 0) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
