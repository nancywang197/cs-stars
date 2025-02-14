package com.example.python_to_java.functions_copy;
import java.util.ArrayList;
import java.util.List;

public class HumanEval_130 {
    /**
     * Given an integer n, return a list of integers representing a triangular sequence.
     *
     * @param n The number of elements in the triangular sequence.
     * @return A list of integers representing the triangular sequence.
     */
    public List<Integer> tri(int n) {
        if (n == 0) {
            List<Integer> result = new ArrayList<>();
            result.add(1);
            return result;
        }
        List<Integer> myTri = new ArrayList<>();
        myTri.add(1);
        myTri.add(3);
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                myTri.add((int)(i / 2 + 1));
            } else {
                myTri.add(myTri.get(i - 1) + myTri.get(i - 2) + (int)((i + 3) / 2));
            }
        }
        return myTri;
    }
}
