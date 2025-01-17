public class HumanEval_102 {
    /**
     * Returns a number or -1 based on given conditions.
     *
     * @param x The first input number.
     * @param y The second input number.
     * @return The result of the condition evaluation.
     */
    public static int chooseNum(int x, int y) {
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