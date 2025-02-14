package com.example.python_to_java.functions_copy;
import java.util.Arrays;
import java.util.List;

public class HumanEval_20 {
    /**
     * Given a list of numbers, find the closest pair of numbers.
     *
     * @param numbers The list of numbers.
     * @return The closest pair of numbers.
     */
    public double[] findClosestElements(List<Double> numbers) {
        double[] closestPair = null;
        Double distance = null;

        for (int idx = 0; idx < numbers.size(); idx++) {
            for (int idx2 = 0; idx2 < numbers.size(); idx2++) {
                if (idx != idx2) {
                    double newDistance = Math.abs(numbers.get(idx) - numbers.get(idx2));
                    if (distance == null || newDistance < distance) {
                        distance = newDistance;
                        double[] pair = {numbers.get(idx), numbers.get(idx2)};
                        Arrays.sort(pair);
                        closestPair = pair;
                    }
                }
            }
        }

        return closestPair;
    }
}
