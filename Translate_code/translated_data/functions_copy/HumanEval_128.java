package com.example.python_to_java.functions_copy;
public class HumanEval_128 {
    /**
     * Given an array of integers, calculate the product of the signs of the numbers and the sum of their absolute values.
     * If the array is empty, return None.  If the array contains 0, the product of signs is 0.
     *
     * @param arr The input array of integers.
     * @return The product of the signs of the numbers multiplied by the sum of their absolute values.
     */
    public int prod_signs(int[] arr) {
        if (arr.length == 0) return 0; //Representing None in Java with 0

        int prod = 0;
        boolean zeroPresent = false;
        for(int num : arr){
            if(num == 0) zeroPresent = true;
        }

        if(!zeroPresent){
            int negCount = 0;
            for(int num : arr){
                if(num < 0) negCount++;
            }
            prod = (int) Math.pow(-1, negCount);
        }

        int sumAbs = 0;
        for(int num : arr){
            sumAbs += Math.abs(num);
        }

        return prod * sumAbs;
    }
}
