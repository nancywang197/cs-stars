class HumanEval_44 {
    /**
     * Given a number x and a base, convert x to the given base.
     *
     * @param x    The number to convert.
     * @param base The base to convert to.
     * @return The converted number as a string.
     */
    public String change_base(int x, int base) {
        String ret = "";
        while (x > 0) {
            ret = Integer.toString(x % base) + ret;
            x /= base;
        }
        return ret;
    }
}
