class HumanEval_49 {
    /**
     * Given n and p, compute (2^n) mod p.
     * @param n the exponent
     * @param p the modulus
     * @return (2^n) mod p
     */
    public int modp(int n, int p) {
        int ret = 1;
        for (int i = 0; i < n; i++) {
            ret = (2 * ret) % p;
        }
        return ret;
    }
}
