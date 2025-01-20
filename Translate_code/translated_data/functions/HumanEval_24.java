class HumanEval_24 {
    /**
     * Given a positive integer n, find the largest divisor of n that is strictly less than n.
     *
     * @param n the input integer
     * @return the largest divisor of n that is strictly less than n
     */
    public int largest_divisor(int n) {
        for (int i = n - 1; i > 0; i--) {
            if (n % i == 0) {
                return i;
            }
        }
        return 1; //Should not reach here for n>1. Added for completeness.

    }
}
