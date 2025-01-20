class HumanEval_102 {
    /**
     * Given two integers x and y, return:
     * -1 if x > y
     * y if y is even
     * -1 if x == y
     * y - 1 otherwise
     *
     * @param x the first integer
     * @param y the second integer
     * @return the result of the conditional logic
     */
    public int choose_num(int x, int y) {
        if (x > y) {
            return -1;
        }
        if (y % 2 == 0) {
            return y;
        }
        if (x == y) {
            return -1;
        }
        return y - 1;
    }
}
