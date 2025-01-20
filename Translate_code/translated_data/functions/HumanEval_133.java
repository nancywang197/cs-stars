class HumanEval_133 {
    /**
     * Given a list of numbers, return the sum of the squares of the ceilings of each number.
     *
     * @param lst The list of numbers.
     * @return The sum of the squares of the ceilings of each number.
     */
    public int sum_squares(int[] lst) {
        int squared = 0;
        for (int i : lst) {
            squared += (int) Math.ceil(i) * (int) Math.ceil(i);
        }
        return squared;
    }
}
