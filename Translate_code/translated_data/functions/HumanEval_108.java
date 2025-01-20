class HumanEval_108 {
    /**
     * Given an array of integers, return the number of integers whose sum of digits is positive.
     *
     * @param arr The input array of integers.
     * @return The number of integers whose sum of digits is positive.
     */
    public int count_nums(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (digits_sum(arr[i]) > 0) {
                count++;
            }
        }
        return count;
    }

    private int digits_sum(int n) {
        int neg = 1;
        if (n < 0) {
            n = -1 * n;
            neg = -1;
        }
        String s = Integer.toString(n);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        digits[0] = digits[0] * neg;
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
}
