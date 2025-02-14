package com.example.python_to_java.functions_copy;
import java.lang.Math;
import java.util.Arrays;

public class HumanEval_115 {
    /**
     * Given a grid of integers and a capacity, return the total number of containers needed to fill the grid.
     *
     * @param grid      The grid of integers.
     * @param capacity The capacity of each container.
     * @return The total number of containers needed to fill the grid.
     */
    public int max_fill(int[][] grid, int capacity) {
        int sum = 0;
        for (int[] arr : grid) {
            int rowSum = Arrays.stream(arr).sum();
            sum += Math.ceil((double) rowSum / capacity);
        }
        return sum;
    }
}
