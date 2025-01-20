class HumanEval_118 {
    /**
     * Given a word, return the closest vowel to the end of the word that is surrounded by consonants.
     * If no such vowel exists, return "".
     *
     * @param word The word to search
     * @return The closest vowel to the end of the word that is surrounded by consonants
     */
    public String get_closest_vowel(String word) {
        if (word.length() < 3) {
            return "";
        }

        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'O', 'U', 'I'));
        for (int i = word.length() - 2; i > 0; i--) {
            char c = word.charAt(i);
            if (vowels.contains(c)) {
                if (!vowels.contains(word.charAt(i + 1)) && !vowels.contains(word.charAt(i - 1))) {
                    return String.valueOf(c);
                }
            }
        }
        return "";
    }
}
