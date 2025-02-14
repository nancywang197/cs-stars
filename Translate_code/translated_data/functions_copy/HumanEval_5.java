package com.example.python_to_java.functions_copy;
import java.util.ArrayList;
import java.util.List;

public class HumanEval_5 {
    /**
     * Given a list of integers, intersperse the list with a given delimiter.
     * For example:
     * intersperse([1, 2, 3], 0) == [1, 0, 2, 0, 3]
     * intersperse([], 0) == []
     * intersperse([1], 0) == [1]
     *
     * @param numbers   The list of integers to intersperse.
     * @param delimeter The delimiter to use.
     * @return The interspersed list.
     */
    public List<Integer> intersperse(List<Integer> numbers, int delimeter) {
        if (numbers == null || numbers.isEmpty()) {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < numbers.size() - 1; i++) {
            result.add(numbers.get(i));
            result.add(delimeter);
        }

        result.add(numbers.get(numbers.size() - 1));

        return result;
    }
}
