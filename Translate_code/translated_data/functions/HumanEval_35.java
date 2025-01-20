class HumanEval_35 {
    /**
     * Given a list of integers, find the maximum element in the list.
     *
     * @param l The list of integers.
     * @return The maximum element in the list.
     */
    public int max_element(int[] l) {
        int m = l[0];
        for (int e : l) {
            if (e > m) {
                m = e;
            }
        }
        return m;
    }
}
