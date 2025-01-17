public class HumanEval_103 {

    /**
     * Calculates the rounded average of a series of numbers from n to m (inclusive).
     *
     * @param n The starting number of the series.
     * @param m The ending number of the series.
     * @return The rounded average, or -1 if m is less than n.
     */
    public static int roundedAvg(int n, int m) {
        if (m < n) {
            return -1;
        }

        long summation = 0; // Use a longer integer type to avoid overflow
        for (int i = n; i <= m; i++) {
            summation += i;
        }
        return (int) Math.round((double) summation / (m - n + 1));
    }

    
}