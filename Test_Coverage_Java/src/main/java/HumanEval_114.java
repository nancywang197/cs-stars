public class Main {
    public static int minSubArraySum(int[] nums) {
        int maxSum = 0;
        long sum = 0; // Use long to avoid overflow issues
        for (int num : nums) {
            sum += -num;
            if (sum < 0) {
                sum = 0;
            }
            maxSum = Math.max(sum, maxSum);
        }

        if (maxSum == 0) {
            int minSum = Integer.MAX_VALUE; // Initialize with positive infinity
            for (int num : nums) {
                minSum = Math.min(minSum, -num);
            }
            return -minSum;
        } else {
            return -maxSum;
        }
    }

    ;
        System.out.println(minSubArraySum(nums)); // Output: -10
    }
}