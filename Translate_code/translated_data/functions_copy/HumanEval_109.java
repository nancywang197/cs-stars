package com.example.python_to_java.functions_copy;

import java.util.Arrays;

public class HumanEval_109 {
    /**
     * Given an array of integers, determine if it is possible to move one ball to the end of the array such that the array is sorted.
     *
     * @param arr The input array of integers.
     * @return True if it is possible to move one ball to the end of the array such that the array is sorted, false otherwise.
     */
    public boolean moveOneBall(int[] arr) {
        if (arr.length == 0) {
            return true;
        }
        Arrays.sort(arr);
        int[] myArr = new int[arr.length];
        int minValue = arr[0];
        int minIndex = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
                minIndex = i;
            }
        }

        for(int i = 0; i < arr.length; i++){
            myArr[i] = arr[(minIndex + i) % arr.length];
        }

        for (int i = 0; i < arr.length; i++) {
            if (myArr[i] != arr[i]) {
                return false;
            }
        }
        return true;
    }
}
