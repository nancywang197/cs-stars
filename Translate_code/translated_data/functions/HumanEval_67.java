class HumanEval_67 {
    /**
     * Given a string s containing space separated numbers and an integer n,
     * return the difference between n and the sum of the numbers in s.
     *
     * @param s The input string
     * @param n The target integer
     * @return The difference between n and the sum of numbers in s
     */
    public int fruit_distribution(String s, int n) {
        String[] arr = s.split(" ");
        int sum = 0;
        for (String str : arr) {
            try {
                int num = Integer.parseInt(str);
                sum += num;
            } catch (NumberFormatException e) {
                // Ignore non-numeric strings
            }
        }
        return n - sum;
    }
}
