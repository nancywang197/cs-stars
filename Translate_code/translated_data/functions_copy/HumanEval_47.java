package com.example.python_to_java.functions_copy;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class HumanEval_47 {
    /**
     * Given a list of numbers, return the median.
     *
     * @param l The list of numbers.
     * @return The median of the list.
     */
    public double median(List<Double> l) {
        Collections.sort(l);
        int len = l.size();
        if (len % 2 == 1) {
            return l.get(len / 2);
        } else {
            return (l.get(len / 2 - 1) + l.get(len / 2)) / 2.0;
        }
    }
}
