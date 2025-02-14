package com.example.python_to_java.functions_copy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Collections;

public class HumanEval_58 {
    /**
     * Given two lists, return a sorted list of the common elements.
     * @param l1 The first list.
     * @param l2 The second list.
     * @return A sorted list of the common elements.
     */
    public List<Integer> common(List<Integer> l1, List<Integer> l2) {
        Set<Integer> ret = new HashSet<>();
        for (Integer e1 : l1) {
            for (Integer e2 : l2) {
                if (e1.equals(e2)) {
                    ret.add(e1);
                }
            }
        }
        List<Integer> result = new ArrayList<>(ret);
        Collections.sort(result);
        return result;
    }
}
