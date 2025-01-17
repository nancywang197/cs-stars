public class CyclicString {

    /**
     * Encodes a cyclic string by cycling elements in groups of 3.
     *
     * @param s The input string to be encoded.
     * @return The encoded cyclic string.
     */
    public static String encodeCyclic(String s) {
        int n = s.length();
        StringBuilder result = new StringBuilder();

        // split string into groups of length 3
        for (int i = 0; i < n; i += 3) {
            int j = Math.min(i + 3, n);
            String group = s.substring(i, j);

            // cycle elements in each group unless it has fewer than 3 elements
            if (group.length() == 3) {
                result.append(group.charAt(1)).append(group.charAt(0));
            } else {
                result.append(group);
            }
        }

        return result.toString();
    }

    /**
     * Decodes a cyclic string by encoding and re-encoding it.
     *
     * @param s The input string to be decoded.
     * @return The decoded cyclic string.
     */
    public static String decodeCyclic(String s) {
        return encodeCyclic(encodeCyclic(s));
    }

    
}