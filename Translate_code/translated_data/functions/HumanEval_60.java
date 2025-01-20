class HumanEval_60 {
    /**
     * Given an integer n, return the sum of integers from 0 to n (inclusive).
     * @param n the upper limit of the sum (inclusive)
     * @return the sum of integers from 0 to n
     */
    public int sum_to_n(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
