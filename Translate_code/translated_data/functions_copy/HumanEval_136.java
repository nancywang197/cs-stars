package com.example.python_to_java.functions_copy;
import java.util.ArrayList;
import java.util.List;

public class HumanEval_136 {
    /**
     * Create a function that returns a tuple (a, b), where 'a' is
     * the largest of negative integers, and 'b' is the smallest
     * of positive integers in a list.
     * If there is no negative or positive integers, return them as None.
     * Examples:
     * largest_smallest_integers([2, 4, 1, 3, 5, 7]) == (None, 1)
     * largest_smallest_integers([]) == (None, None)
     * largest_smallest_integers([0]) == (None, None)
     */
    public int[] largest_smallest_integers(int[] lst) {
        List<Integer> smallest = new ArrayList<>();
        List<Integer> largest = new ArrayList<>();
        for (int x : lst) {
            if (x < 0) {
                smallest.add(x);
            } else if (x > 0) {
                largest.add(x);
            }
        }

        int a = smallest.isEmpty() ? Integer.MIN_VALUE : Integer.MIN_VALUE;
        int b = largest.isEmpty() ? Integer.MAX_VALUE : Integer.MAX_VALUE;

        if (!smallest.isEmpty()) {
            a = smallest.get(0);
            for (int i = 1; i < smallest.size(); i++) {
                if (smallest.get(i) > a) {
                    a = smallest.get(i);
                }
            }
        }

        if (!largest.isEmpty()) {
            b = largest.get(0);
            for (int i = 1; i < largest.size(); i++) {
                if (largest.get(i) < b) {
                    b = largest.get(i);
                }
            }
        }


        if(a == Integer.MIN_VALUE) a = -1;
        if(b == Integer.MAX_VALUE) b = -1;

        if(a == -1 && b == -1) return new int[]{};
        if(a == -1) return new int[]{b};
        if(b == -1) return new int[]{a};

        return new int[]{a, b};
    }
}
