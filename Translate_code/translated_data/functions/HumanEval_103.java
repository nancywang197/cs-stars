class HumanEval_103 {
    /**
     * Given two integers n and m, this function calculates the rounded average of the numbers from n to m (inclusive).
     * If m is less than n, it returns -1.
     *
     * @param n the starting integer
     * @param m the ending integer
     * @return the binary representation of the rounded average of numbers from n to m, or -1 if m < n
     */
    public String rounded_avg(int n, int m) {
        if (m < n) {
            return "-1";
        }
        long summation = 0;
        for (int i = n; i <= m; i++) {
            summation += i;
        }
        return Integer.toBinaryString((int) Math.round((double) summation / (m - n + 1)));
    }
}
