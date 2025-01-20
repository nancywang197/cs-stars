class HumanEval_73 {
    /**
     * Given an array arr, find the minimum number of changes needed to make the array a palindrome.
     * A palindrome is a sequence that reads the same forwards and backward.
     *
     * @param arr The input array.
     * @return The minimum number of changes needed to make the array a palindrome.
     */
    public int smallest_change(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                ans += 1;
            }
        }
        return ans;
    }
}
