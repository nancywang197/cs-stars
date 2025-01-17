public class Main {
    

    /**
     * Returns the largest prime factor of a given number.
     *
     * @param n The input number.
     * @return The largest prime factor of n.
     */
    public static int largestPrimeFactor(int n) {
        return findLargestPrimeFactor(n);
    }

    private static int findLargestPrimeFactor(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = true;
                }
            }
        }

        int largestFactor = 1;
        for (int j = 2; j <= Math.sqrt(n); j++) {
            if (!isPrime[j]) {
                while (n % j == 0) {
                    largestFactor = j;
                    n /= j;
                }
            }
        }

        return n > 1 ? n : largestFactor;
    }
}