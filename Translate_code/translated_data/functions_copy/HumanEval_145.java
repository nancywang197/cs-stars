//package com.example.python_to_java.functions_copy;
//import java.util.Arrays;
//import java.util.Comparator;
//
//public class HumanEval_145 {
//    /**
//     * Sorts an array of integers based on the sum of their digits.
//     *
//     * @param nums The input array of integers.
//     * @return The sorted array of integers.
//     */
//    public int[] orderByPoints(int[] nums) {
//        Arrays.sort(nums, Comparator.comparingInt(this::digitsSum));
//        return nums;
//    }
//
//    private int digitsSum(int n) {
//        int neg = 1;
//        if (n < 0) {
//            n = -1 * n;
//            neg = -1;
//        }
//        String s = Integer.toString(n);
//        int sum = 0;
//        int firstDigit = Integer.parseInt(String.valueOf(s.charAt(0)));
//        sum += firstDigit * neg;
//        for (int i = 1; i < s.length(); i++) {
//            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
//        }
//        return sum;
//    }
//}
