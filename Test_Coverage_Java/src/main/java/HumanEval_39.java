public class Main {
    

    /**
     * Returns the nth prime Fibonacci number.
     *
     * @param n The position of the prime Fibonacci number to find.
     * @return The nth prime Fibonacci number.
     */
    public static long primeFib(int n) {
        boolean[] isPrime = new boolean[1000001];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i <= Math.sqrt(1000000); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        long[] fib = new long[n];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            while (!isPrime[fib[i - 1] + fib[i - 2]]) {
                fib[i] += fib[i - 1];
            }
            if (fib[i] == fib[i - 1] + fib[i - 2]) {
                break;
            } else {
                i--;
            }
        }

        return fib[n - 1];
    }
}