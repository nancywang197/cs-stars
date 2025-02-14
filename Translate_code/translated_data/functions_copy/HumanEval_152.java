package com.example.python_to_java.functions_copy;
import java.util.ArrayList;
import java.util.List;

public class HumanEval_152 {
    /**
     * Given two lists of integers, compute the absolute difference between corresponding elements.
     *
     * @param game  The first list of integers.
     * @param guess The second list of integers.
     * @return A list of integers representing the absolute differences between corresponding elements.
     */
    public List<Integer> compare(List<Integer> game, List<Integer> guess) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < game.size(); i++) {
            result.add(Math.abs(game.get(i) - guess.get(i)));
        }
        return result;
    }
}
