package com.example.python_to_java.functions_copy;
public class HumanEval_114 {
    /**
     * Given an array of integers nums, find the minimum sum of a subarray.
     *
     * @param nums The input array of integers.
     * @return The minimum sum of a subarray.
     */
    public int minSubArraySum(int[] nums) {
        int max_sum = 0;
        int s = 0;
        for (int num : nums) {
            s += -num;
            if (s < 0) {
                s = 0;
            }
            max_sum = Math.max(s, max_sum);
        }
        if (max_sum == 0) {
            int max_negative = Integer.MIN_VALUE;
            for (int num : nums) {
                max_negative = Math.max(max_negative, -num);
            }
            max_sum = max_negative;
        }
        int min_sum = -max_sum;
        return min_sum;
    }
}
