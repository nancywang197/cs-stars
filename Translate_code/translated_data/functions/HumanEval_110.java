class HumanEval_110 {
    /**
     * Given two lists lst1 and lst2, check if the number of even numbers in lst2 is greater than or equal to the number of odd numbers in lst1.
     * @param lst1 The first list of integers.
     * @param lst2 The second list of integers.
     * @return "YES" if the number of even numbers in lst2 is greater than or equal to the number of odd numbers in lst1, "NO" otherwise.
     */
    public String exchange(int[] lst1, int[] lst2) {
        int odd = 0;
        int even = 0;
        for (int i : lst1) {
            if (i % 2 == 1) {
                odd++;
            }
        }
        for (int i : lst2) {
            if (i % 2 == 0) {
                even++;
            }
        }
        if (even >= odd) {
            return "YES";
        }
        return "NO";
    }
}
