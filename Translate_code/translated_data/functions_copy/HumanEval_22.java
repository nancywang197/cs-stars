package com.example.python_to_java.functions_copy;
import java.util.ArrayList;
import java.util.List;

public class HumanEval_22 {
    /**
     * Given a list of values, return a new list containing only the integers.
     *
     * @param values The input list of values.
     * @return A new list containing only the integers from the input list.
     */
    public List<Integer> filterIntegers(List<Object> values) {
        List<Integer> result = new ArrayList<>();
        for (Object x : values) {
            if (x instanceof Integer) {
                result.add((Integer) x);
            }
        }
        return result;
    }
}
