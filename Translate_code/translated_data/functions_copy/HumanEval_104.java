package com.example.python_to_java.functions_copy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HumanEval_104 {
    /**
     * Given a list of integers, return a sorted list of integers that contain only odd digits.
     *
     * @param x The input list of integers.
     * @return A sorted list of integers that contain only odd digits.
     */
    public List<Integer> uniqueDigits(List<Integer> x) {
        List<Integer> oddDigitElements = new ArrayList<>();
        for (int i : x) {
            boolean allOdd = true;
            String s = Integer.toString(i);
            for (int j = 0; j < s.length(); j++) {
                int digit = Integer.parseInt(String.valueOf(s.charAt(j)));
                if (digit % 2 == 0) {
                    allOdd = false;
                    break;
                }
            }
            if (allOdd) {
                oddDigitElements.add(i);
            }
        }
        Collections.sort(oddDigitElements);
        return oddDigitElements;
    }
}
