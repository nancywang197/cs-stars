public class HumanEval_107 {

    /**
     * Checks if a number is palindrome.
     *
     * @param n The input number.
     * @return True if the number is palindrome, false otherwise.
     */
    public static boolean isPalindrome(int n) {
        String strN = Integer.toString(n);
        int left = 0;
        int right = strN.length() - 1;

        while (left < right) {
            if (strN.charAt(left) != strN.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    /**
     * Counts the number of even and odd palindromes up to a given number.
     *
     * @param n The upper limit.
     * @return A tuple containing the count of even palindromes and odd palindromes.
     */
    public static int[] evenOddPalindromeCount(int n) {
        boolean isEven = false;
        if (n % 2 == 0) {
            isEven = true;
        }

        int evenPalindromes = 0;
        int oddPalindromes = 0;

        for (int i = 1; i <= n; i++) {
            if ((i % 2 == 1 && isPalindrome(i)) || (isEven && isPalindrome(i))) {
                if (i % 2 == 1) {
                    oddPalindromes++;
                } else {
                    evenPalindromes++;
                }
            }
        }

        return new int[]{evenPalindromes, oddPalindromes};
    }

    
}