class HumanEval_38 {
    /**
     * Encodes a string using a cyclic shift.
     *
     * @param s The input string.
     * @return The encoded string.
     */
    public String encode_cyclic(String s) {
        int len = s.length();
        int numGroups = (len + 2) / 3;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numGroups; i++) {
            int start = 3 * i;
            int end = Math.min(3 * i + 3, len);
            String group = s.substring(start, end);
            if (group.length() == 3) {
                sb.append(group.substring(1) + group.charAt(0));
            } else {
                sb.append(group);
            }
        }
        return sb.toString();
    }

    /**
     * Decodes a string encoded using cyclic shift.
     *
     * @param s The encoded string.
     * @return The decoded string.
     */
    public String decode_cyclic(String s) {
        return encode_cyclic(encode_cyclic(s));
    }
}
