class HumanEval_10 {
    /**
     * Given a string, determine if it is a palindrome.
     * @param string The string to check.
     * @return True if the string is a palindrome, False otherwise.
     */
    boolean isPalindrome(String string) {
        String reversedString = new StringBuilder(string).reverse().toString();
        return string.equals(reversedString);
    }

    /**
     * Given a string, return the shortest palindrome that can be formed by appending characters to the end of the string.
     * @param string The string to make a palindrome from.
     * @return The shortest palindrome that can be formed from the string.
     */
    String makePalindrome(String string) {
        if (string == null || string.isEmpty()) {
            return "";
        }

        int beginningOfSuffix = 0;

        while (!isPalindrome(string.substring(beginningOfSuffix))) {
            beginningOfSuffix++;
        }

        String prefix = string.substring(0, beginningOfSuffix);
        String reversedPrefix = new StringBuilder(prefix).reverse().toString();
        return string + reversedPrefix;
    }
}
