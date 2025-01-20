class HumanEval_154 {
    /**
     * Checks if pattern b cyclically occurs in a.
     * @param a The string to search in.
     * @param b The pattern to search for.
     * @return True if the pattern occurs cyclically in the string, False otherwise.
     */
    public boolean cycpattern_check(String a, String b) {
        int l = b.length();
        String pat = b + b;
        for (int i = 0; i <= a.length() - l; i++) {
            for (int j = 0; j <= l; j++) {
                if (a.substring(i, i + l).equals(pat.substring(j, j + l))) {
                    return true;
                }
            }
        }
        return false;
    }
}
