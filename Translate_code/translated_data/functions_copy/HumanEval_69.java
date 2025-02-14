package com.example.python_to_java.functions_copy;
import java.util.List;
import java.util.ArrayList;
public class HumanEval_69 {
    /**
     * You are given a non-empty list of positive integers. Return the greatest integer that is greater than 
     * zero, and has a frequency greater than or equal to the value of the integer itself. 
     * The frequency of an integer is the number of times it appears in the list.
     * If no such a value exist, return -1.
     * Examples:
     *     search([4, 1, 2, 2, 3, 1]) == 2
     *     search([1, 2, 2, 3, 3, 3, 4, 4, 4]) == 3
     *     search([5, 5, 4, 4, 4]) == -1
     */
    public int search(int[] lst) {
        int maxVal = 0;
        for(int i = 0; i < lst.length; i++){
            if(lst[i] > maxVal) maxVal = lst[i];
        }
        int[] frq = new int[maxVal + 1];
        for (int i : lst) {
            frq[i]++;
        }

        int ans = -1;
        for (int i = 1; i < frq.length; i++) {
            if (frq[i] >= i) {
                ans = i;
            }
        }

        return ans;
    }
}
