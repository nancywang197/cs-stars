public class HumanEval_49 {
    /**
     * Calculates the result of 2^n mod p using modular exponentiation.
     *
     * @param n The exponent.
     * @param p The modulus.
     * @return The result of 2^n mod p.
     */
    public static int modp(int n, int p) {
        long ret = 1; // Using a 64-bit variable to avoid overflow
        for (int i = 0; i < n; i++) {
            ret = (ret * 2) % p;
        }
        return (int) ret; // Converting back to an integer before returning
    }

    
}