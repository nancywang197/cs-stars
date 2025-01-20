class HumanEval_84 {
    /**
     * Given an integer N, return the binary representation of the sum of its digits.
     *
     * @param N The input integer.
     * @return The binary representation of the sum of the digits of N.
     */
    public String solve(int N) {
        int sum = 0;
        String nStr = Integer.toString(N);
        for (int i = 0; i < nStr.length(); i++) {
            sum += Integer.parseInt(String.valueOf(nStr.charAt(i)));
        }
        return Integer.toBinaryString(sum);
    }
}
