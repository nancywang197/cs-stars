package com.example.python_to_java.functions_copy;
public class HumanEval_147 {
    /**
     * Given an integer n, find the number of triples (A[i], A[j], A[k]) such that i < j < k and (A[i] + A[j] + A[k]) % 3 == 0.
     * A[i] = i*i - i + 1
     *
     * @param n the input integer
     * @return the number of triples
     */
    public int get_max_triples(int n) {
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = (i + 1) * (i + 1) - (i + 1) + 1;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if ((A[i] + A[j] + A[k]) % 3 == 0) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
