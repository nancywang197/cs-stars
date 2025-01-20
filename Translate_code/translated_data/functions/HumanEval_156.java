class HumanEval_156 {
    /**
     * Converts an integer to its lowercase mini-roman representation.
     *
     * @param number The integer to convert.
     * @return The lowercase mini-roman representation of the integer.
     */
    public String intToMiniRoman(int number) {
        int[] num = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] sym = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int i = 12;
        String res = "";
        while (number > 0) {
            int div = number / num[i];
            number %= num[i];
            while (div > 0) {
                res += sym[i];
                div--;
            }
            i--;
        }
        return res.toLowerCase();
    }
}
