public class Main {

    /**
     * Returns the nth Fibonacci number.
     *
     * @param n The index of the Fibonacci number to be calculated.
     * @return The nth Fibonacci number.
     */
    public static int fibfib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            // Optimizing the recursive call to avoid repeated calculations
            int result = fibfib(n - 1);
            result += fibfib(n - 2);
            result += fibfib(n - 3);
            return result;
        }
    }

    
}