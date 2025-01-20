class HumanEval_159 {
    /**
     * Given number, need, and remaining, return the new number and remaining amount.
     * If need is less than or equal to remaining, return number + need and remaining - need.
     * Otherwise, return number + remaining and 0.
     *
     * @param number   The initial number.
     * @param need     The amount needed.
     * @param remaining The amount remaining.
     * @return An array containing the new number and the remaining amount.
     */
    public int[] eat(int number, int need, int remaining) {
        if (need <= remaining) {
            return new int[]{number + need, remaining - need};
        } else {
            return new int[]{number + remaining, 0};
        }
    }
}
