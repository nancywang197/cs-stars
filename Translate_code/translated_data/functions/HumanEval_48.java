class HumanEval_48 {
    /**
     * Checks if a given string is a palindrome.
     *
     * @param text The input string.
     * @return True if the string is a palindrome, False otherwise.
     */
    public boolean is_palindrome(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
