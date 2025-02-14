package com.example.python_to_java.functions_copy;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HumanEval_90 {
    /**
     * Given a list of integers, find the next smallest integer.
     *
     * @param lst The list of integers.
     * @return The next smallest integer, or None if the list has fewer than 2 elements.
     */
    public Integer next_smallest(Integer[] lst) {
        Set<Integer> uniqueLst = new HashSet<>(Arrays.asList(lst));
        Integer[] sortedLst = uniqueLst.toArray(new Integer[0]);
        Arrays.sort(sortedLst);
        if (sortedLst.length < 2) {
            return null;
        } else {
            return sortedLst[1];
        }
    }
}
