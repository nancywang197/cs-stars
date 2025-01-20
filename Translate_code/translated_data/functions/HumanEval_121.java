class HumanEval_121 {
    /**
     * Given a list of integers lst, return the sum of all odd numbers at even indices.
     *
     * @param lst The list of integers.
     * @return The sum of all odd numbers at even indices.
     */
    public int solution(int[] lst) {
        int sum = 0;
        for (int i = 0; i < lst.length; i++) {
            if (i % 2 == 0 && lst[i] % 2 != 0) {
                sum += lst[i];
            }
        }
        return sum;
    }
}
