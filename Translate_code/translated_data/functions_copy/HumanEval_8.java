package com.example.python_to_java.functions_copy;
import java.util.List;
import java.util.Arrays;

public class HumanEval_8 {
    /**
     * Given a list of integers, return a tuple containing the sum and product of the numbers.
     *
     * @param numbers A list of integers.
     * @return A tuple containing the sum and product of the numbers.
     */
    public int[] sum_product(List<Integer> numbers) {
        int sum_value = 0;
        int prod_value = 1;

        for (int n : numbers) {
            sum_value += n;
            prod_value *= n;
        }
        return new int[]{sum_value, prod_value};
    }
}
