class HumanEval_40 {
    /**
     * Given a list of integers, determine if there are three numbers in the list that sum to zero.
     *
     * @param l The list of integers.
     * @return True if there are three numbers in the list that sum to zero, false otherwise.
     */
    public boolean triples_sum_to_zero(int[] l) {
        for (int i = 0; i < l.length; i++) {
            for (int j = i + 1; j < l.length; j++) {
                for (int k = j + 1; k < l.length; k++) {
                    if (l[i] + l[j] + l[k] == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
