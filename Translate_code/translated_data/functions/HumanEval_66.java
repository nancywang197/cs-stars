class HumanEval_66 {
    /**
     * Given a string s, return the sum of the ASCII values of all uppercase letters in s.
     * If s is empty, return 0.
     *
     * @param s The input string.
     * @return The sum of the ASCII values of all uppercase letters in s.
     */
    public int digitSum(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sum += (int) c;
            }
        }
        return sum;
    }
}
