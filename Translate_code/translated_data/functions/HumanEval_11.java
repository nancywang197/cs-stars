class HumanEval_11 {
    /**
     * Given two binary strings a and b, return their bitwise XOR.
     *
     * @param a The first binary string.
     * @param b The second binary string.
     * @return The bitwise XOR of a and b.
     */
    public String string_xor(String a, String b) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            char x = a.charAt(i);
            char y = b.charAt(i);
            if (x == y) {
                result.append('0');
            } else {
                result.append('1');
            }
        }
        return result.toString();
    }
}
