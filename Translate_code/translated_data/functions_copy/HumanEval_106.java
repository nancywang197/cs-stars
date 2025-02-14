package com.example.python_to_java.functions_copy;
import java.util.ArrayList;
import java.util.List;

public class HumanEval_106 {
    /**
     * Given a positive integer n, return a list of integers ret such that:
     * - If i is even, ret[i-1] is the factorial of i.
     * - If i is odd, ret[i-1] is the sum of integers from 1 to i.
     *
     * @param n a positive integer
     * @return a list of integers
     */
    public List<Integer> f(int n) {
        List<Integer> ret = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                int x = 1;
                for (int j = 1; j <= i; j++) {
                    x *= j;
                }
                ret.add(x);
            } else {
                int x = 0;
                for (int j = 1; j <= i; j++) {
                    x += j;
                }
                ret.add(x);
            }
        }
        return ret;
    }
}
