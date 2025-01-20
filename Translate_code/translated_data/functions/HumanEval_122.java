class HumanEval_122 {
    /**
     * Given an array of integers arr and an integer k, return the sum of the elements in the first k elements of arr whose string representation has a length less than or equal to 2.
     *
     * @param arr The input array of integers.
     * @param k The number of elements to consider from the beginning of the array.
     * @return The sum of the elements that satisfy the condition.
     */
    public int add_elements(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < Math.min(arr.length, k); i++) {
            String s = Integer.toString(arr[i]);
            if (s.length() <= 2) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
