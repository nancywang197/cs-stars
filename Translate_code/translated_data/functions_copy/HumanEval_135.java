package com.example.python_to_java.functions_copy;
public class HumanEval_135 {
    /**
     * Given an array of integers, find the index of the first element that is smaller than the previous element.
     *
     * @param arr The input array of integers.
     * @return The index of the first element that is smaller than the previous element, or -1 if no such element exists.
     */
    public int can_arrange(int[] arr) {
        int ind = -1;
        int i = 1;
        while (i < arr.length) {
            if (arr[i] < arr[i - 1]) {
                ind = i;
            }
            i += 1;
        }
        return ind;
    }
}
