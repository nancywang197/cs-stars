class HumanEval_52 {
    /**
     * Given a list of integers and a threshold integer, determine if all elements in the list are below the threshold.
     * @param l The list of integers.
     * @param t The threshold integer.
     * @return True if all elements in the list are below the threshold, False otherwise.
     */
    public boolean below_threshold(int[] l, int t) {
        for (int e : l) {
            if (e >= t) {
                return false;
            }
        }
        return true;
    }
}
