package com.example.python_to_java.functions_copy;
import java.util.ArrayList;
import java.util.List;

public class HumanEval_30 {
    /**
     * Given a list of integers, return a new list containing only the positive integers from the input list.
     *
     * @param l The input list of integers.
     * @return A new list containing only the positive integers from the input list.
     */
    public List<Integer> get_positive(List<Integer> l) {
        List<Integer> positiveIntegers = new ArrayList<>();
        for (Integer e : l) {
            if (e > 0) {
                positiveIntegers.add(e);
            }
        }
        return positiveIntegers;
    }
}
