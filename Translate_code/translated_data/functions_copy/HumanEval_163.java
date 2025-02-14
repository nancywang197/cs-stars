package com.example.python_to_java.functions_copy;
import java.util.ArrayList;
import java.util.List;

public class HumanEval_163 {
    /**
     * Generates a list of even integers within a specified range.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return A list of even integers between the lower and upper bounds (inclusive).  Returns an empty list if the range is invalid.
     */
    public List<Integer> generateIntegers(int a, int b) {
        int lower = Math.max(2, Math.min(a, b));
        int upper = Math.min(8, Math.max(a, b));

        List<Integer> result = new ArrayList<>();
        for (int i = lower; i <= upper; i++) {
            if (i % 2 == 0) {
                result.add(i);
            }
        }
        return result;
    }
}
