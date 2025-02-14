package com.example.python_to_java.functions_copy;
import java.util.ArrayList;
import java.util.List;

public class HumanEval_42 {
    /**
     * Given a list of integers, increment each element by 1.
     *
     * @param l The input list of integers.
     * @return A new list with each element incremented by 1.
     */
    public List<Integer> incr_list(List<Integer> l) {
        List<Integer> result = new ArrayList<>();
        for (Integer e : l) {
            result.add(e + 1);
        }
        return result;
    }
}
