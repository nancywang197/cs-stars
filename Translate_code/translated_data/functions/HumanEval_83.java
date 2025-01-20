class HumanEval_83 {
    /**
     * Given an integer n, return 1 if n is 1, otherwise return 18 * (10^(n-2)).
     *
     * @param n an integer
     * @return an integer
     */
    public int starts_one_ends(int n) {
        if (n == 1) {
            return 1;
        }
        return 18 * (int) Math.pow(10, n - 2);
    }
}
