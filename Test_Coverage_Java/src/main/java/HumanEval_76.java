public class HumanEval_76 {
    /**
     * Checks if a number is a simple power.
     *
     * A simple power is defined as an integer that can be expressed in the form:
     *   x = n^k, where n and k are positive integers and 1 ≤ n < x < n^k
     *
     * @param x The number to check
     * @param n The base for the exponentiation
     * @return True if x is a simple power, false otherwise
     */
    public static boolean isSimplePower(int x, int n) {
        // Handle edge case where n equals 1
        if (n == 1) {
            return x == 1;
        }

        long power = 1; // Use long to avoid overflow for large numbers

        while (power < x) {
            power *= n;
        }

        return power == x;
    }

    
}