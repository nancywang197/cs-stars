public class HumanEval_16 {
    /**
     * Returns the number of distinct characters in a given string.
     *
     * @param str The input string.
     * @return The number of distinct characters in the string.
     */
    public static int countDistinctCharacters(String str) {
        // Convert the string to lowercase
        String lowerCaseStr = str.toLowerCase();
        
        // Use HashSet to store unique characters
        Set<Character> uniqueChars = new HashSet<>();
        
        for (char c : lowerCaseStr.toCharArray()) {
            uniqueChars.add(c);
        }
        
        // Return the size of the set
        return uniqueChars.size();
    }
}