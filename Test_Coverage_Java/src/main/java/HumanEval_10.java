public class Palindrome {

    /**
     * Checks if a given string is a palindrome.
     *
     * @param s The input string.
     * @return True if the string is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(String s) {
        return s.equals(s reversible());
    }

    /**
     * Generates the longest palindromic substring from the given string.
     *
     * @param s The input string.
     * @return The longest palindromic substring.
     */
    public static String makePalindrome(String s) {
        if (s.isEmpty()) {
            return "";
        }

        int beginningOfSuffix = 0;

        // Expand around the center of the palindrome
        while (!isPalindrome(s.substring(beginningOfSuffix))) {
            beginningOfSuffix++;
        }

        // Reverse and append to the original string
        return s + reverse(s.substring(0, beginningOfSuffix));
    }

    /**
     * Reverses a given substring.
     *
     * @param s The input substring.
     * @return The reversed substring.
     */
    private static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    
}