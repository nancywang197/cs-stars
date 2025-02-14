package com.example.python_to_java.functions_copy;
import java.util.List;
import java.util.ArrayList;
public class HumanEval_151 {
    /**
     * Given a list of numbers, return the sum of squares of the numbers
     * in the list that are odd. Ignore numbers that are negative or not integers.
     * double_the_difference([1, 3, 2, 0]) == 1 + 9 + 0 + 0 = 10
     * double_the_difference([-1, -2, 0]) == 0
     * double_the_difference([9, -2]) == 81
     * double_the_difference([0]) == 0  
     * If the input list is empty, return 0.
     */
    public int double_the_difference(int[] lst) {
        int sum = 0;
        for (int i : lst) {
            if (i > 0 && i % 2 != 0 && String.valueOf(i).indexOf('.') == -1) {
                sum += i * i;
            }
        }
        return sum;
    }
}
