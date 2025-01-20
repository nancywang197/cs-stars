class HumanEval_43 {
    /**
     * Given a list of integers, determine whether any two numbers sum to zero.
     *
     * @param l The list of integers.
     * @return True if any two numbers in the list sum to zero, False otherwise.
     */
    public boolean pairsSumToZero(int[] l) {
        for (int i = 0; i < l.length; i++) {
            for (int j = i + 1; j < l.length; j++) {
                if (l[i] + l[j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
