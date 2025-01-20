class HumanEval_64 {
    /**
     * Counts the number of vowels in a string, treating 'y' and 'Y' as vowels if they are at the end of the string.
     *
     * @param s The input string.
     * @return The number of vowels in the string.
     */
    public int vowels_count(String s) {
        String vowels = "aeiouAEIOU";
        int n_vowels = 0;
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                n_vowels++;
            }
        }
        if (s.length() > 0 && (s.charAt(s.length() - 1) == 'y' || s.charAt(s.length() - 1) == 'Y')) {
            n_vowels++;
        }
        return n_vowels;
    }
}
