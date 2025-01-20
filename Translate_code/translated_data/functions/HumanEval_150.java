class HumanEval_150 {
    /**
     * Given n, x, and y, return x if n is a prime number, and y otherwise.
     * @param n an integer
     * @param x an integer
     * @param y an integer
     * @return x if n is a prime number, and y otherwise
     */
    public int x_or_y(int n, int x, int y) {
        if (n == 1) {
            return y;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return y;
            }
        }
        return x;
    }
}
