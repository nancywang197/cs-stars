class HumanEval_27 {
    /**
     * Given a string, return a new string with the case of each character flipped.
     *
     * @param string The input string.
     * @return A new string with the case of each character flipped.
     */
    public String flip_case(String string) {
        StringBuilder sb = new StringBuilder();
        for (char c : string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
