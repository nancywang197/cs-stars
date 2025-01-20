class HumanEval_57 {
    /**
     * Given a list of integers, determine if the list is monotonic (either increasing or decreasing).
     *
     * @param l The input list of integers.
     * @return True if the list is monotonic, False otherwise.
     */
    public boolean monotonic(int[] l) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < l.length; i++) {
            if (l[i] < l[i - 1]) {
                increasing = false;
            }
            if (l[i] > l[i - 1]) {
                decreasing = false;
            }
        }

        return increasing || decreasing;
    }
}
