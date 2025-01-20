class HumanEval_79 {
    /**
     * Converts a decimal number to its binary representation, prefixed and suffixed with "db".
     *
     * @param decimal The decimal number to convert.
     * @return The binary representation of the decimal number, prefixed and suffixed with "db".
     */
    public String decimalToBinary(int decimal) {
        return "db" + Integer.toBinaryString(decimal) + "db";
    }
}
