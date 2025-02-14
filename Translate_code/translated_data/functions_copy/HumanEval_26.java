package com.example.python_to_java.functions_copy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HumanEval_26 {
    /**
     * Given a list of integers, remove all duplicates from the list such that each element appears only once.
     * The relative order of the elements should be maintained.
     *
     * @param numbers The input list of integers.
     * @return The list of integers with duplicates removed.
     */
    public List<Integer> removeDuplicates(List<Integer> numbers) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int n : numbers) {
            counts.put(n, counts.getOrDefault(n, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (int n : numbers) {
            if (counts.get(n) <= 1) {
                result.add(n);
            }
        }
        return result;
    }
}
