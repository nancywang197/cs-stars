package com.example.python_to_java.functions_copy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HumanEval_19 {
    /**
     * Sorts a string of numbers represented as words.
     *
     * @param numbers A string of space-separated numbers represented as words.
     * @return A string of space-separated numbers sorted in ascending order.
     */
    public String sort_numbers(String numbers) {
        Map<String, Integer> valueMap = new HashMap<>();
        valueMap.put("zero", 0);
        valueMap.put("one", 1);
        valueMap.put("two", 2);
        valueMap.put("three", 3);
        valueMap.put("four", 4);
        valueMap.put("five", 5);
        valueMap.put("six", 6);
        valueMap.put("seven", 7);
        valueMap.put("eight", 8);
        valueMap.put("nine", 9);

        String[] numArr = numbers.split(" ");
        String[] filteredArr = Arrays.stream(numArr).filter(s -> !s.isEmpty()).toArray(String[]::new);

        Arrays.sort(filteredArr, (a, b) -> valueMap.get(a) - valueMap.get(b));

        return String.join(" ", filteredArr);
    }
}
