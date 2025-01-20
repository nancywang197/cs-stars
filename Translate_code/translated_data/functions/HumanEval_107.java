class HumanEval_107 {
    /**
     * Given an integer n, return a tuple containing the count of even palindromic numbers and odd palindromic numbers from 1 to n (inclusive).
     *
     * @param n the upper limit of the range
     * @return a tuple containing the count of even palindromic numbers and odd palindromic numbers
     */
    public int[] evenOddPalindrome(int n) {
        int evenPalindromeCount = 0;
        int oddPalindromeCount = 0;

        for (int i = 1; i <= n; i++) {
            if (isPalindrome(i)) {
                if (i % 2 == 1) {
                    oddPalindromeCount++;
                } else {
                    evenPalindromeCount++;
                }
            }
        }
        return new int[]{evenPalindromeCount, oddPalindromeCount};
    }

    private boolean isPalindrome(int n) {
        String s = Integer.toString(n);
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}
