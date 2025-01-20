class HumanEval_85 {
    /**
     * Given a list of integers, return the sum of all even numbers at odd indices.
     * @param lst The input list of integers.
     * @return The sum of all even numbers at odd indices.
     */
    public int add(int[] lst) {
        int sum = 0;
        for (int i = 1; i < lst.length; i += 2) {
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            }
        }
        return sum;
    }
}
