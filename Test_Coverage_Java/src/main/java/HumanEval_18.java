public class HumanEval_18 {

    /**
     * Returns the number of occurrences of a given substring in a string.
     *
     * @param string The main string to be searched.
     * @param substring The substring to be found.
     * @return The number of times the substring appears in the string.
     */
    public static int howManyTimes(String string, String substring) {
        if (string == null || substring == null) {
            throw new NullPointerException("Both string and substring must not be null");
        }

        int count = 0;
        for (int i = 0; i <= string.length() - substring.length(); i++) {
            if (string.substring(i, i + substring.length()).equals(substring)) {
                count++;
            }
        }

        return count;
    }

    
}