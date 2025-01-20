class HumanEval_15 {
    /**
     * Given an integer n, return a string that contains the numbers from 0 to n, separated by spaces.
     *
     * @param n The integer n.
     * @return A string that contains the numbers from 0 to n, separated by spaces.
     */
    public String string_sequence(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            sb.append(i);
            if (i < n) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
