class HumanEval_31 {
    /**
     * Checks if a number is prime.
     * @param n the number to check
     * @return true if n is prime, false otherwise
     */
    public boolean is_prime(int n) {
        if (n < 2) {
            return false;
        }
        for (int k = 2; k < n - 1; k++) {
            if (n % k == 0) {
                return false;
            }
        }
        return true;
    }
}
