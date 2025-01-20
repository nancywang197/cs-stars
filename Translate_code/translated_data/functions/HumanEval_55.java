class HumanEval_55 {
    /**
     * Given n, return the nth Fibonacci number.
     * @param n the index of the Fibonacci number to return
     * @return the nth Fibonacci number
     */
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
