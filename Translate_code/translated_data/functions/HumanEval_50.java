class HumanEval_50 {
    /**
     * Encodes a string using a Caesar cipher with a shift of 5.
     *
     * @param s The string to encode.
     * @return The encoded string.
     */
    public String encode_shift(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            sb.append((char) (((ch + 5 - 'a') % 26) + 'a'));
        }
        return sb.toString();
    }

    /**
     * Decodes a string encoded using a Caesar cipher with a shift of 5.
     *
     * @param s The string to decode.
     * @return The decoded string.
     */
    public String decode_shift(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            sb.append((char) (((ch - 5 - 'a') % 26 + 26) % 26 + 'a')); //added +26 to handle negative modulo
        }
        return sb.toString();
    }
}
