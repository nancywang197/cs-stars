package com.example.python_to_java.functions_copy;
import java.util.ArrayList;
import java.util.List;

public class HumanEval_62 {
    /**
     * Given a list of numbers, return a new list containing the derivative of the input list.
     * The derivative of a list is a new list where each element is the product of the index and the value at that index, starting from index 1.
     *
     * @param xs The input list of numbers.
     * @return A new list containing the derivative of the input list.
     */
    public List<Integer> derivative(List<Integer> xs) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < xs.size(); i++) {
            result.add(i * xs.get(i));
        }
        return result;
    }
}
