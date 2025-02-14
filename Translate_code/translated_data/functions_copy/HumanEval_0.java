// package com.example.python_to_java.functions_copy;
package functions_copy; 
import java.util.List;

public class HumanEval_0 {
    /**
     * Given a list of numbers and a threshold, determine if there are any two numbers in the list that are closer to each other than the threshold.
     *
     * @param numbers   The list of numbers to check.
     * @param threshold The threshold distance.
     * @return True if there are any two numbers in the list that are closer to each other than the threshold, false otherwise.
     */
    public boolean hasCloseElements(List<Float> numbers, float threshold) {
        for (int idx = 0; idx < numbers.size(); idx++) {
            for (int idx2 = 0; idx2 < numbers.size(); idx2++) {
                if (idx != idx2) {
                    float distance = Math.abs(numbers.get(idx) - numbers.get(idx2));
                    if (distance < threshold) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
