public class HumanEval_119 {


    /**
     * Checks if it's possible to make a good string by concatenating two input strings.
     *
     * @param lst A list of two strings consisting of open and close parentheses only.
     * @return 'Yes' if a good string can be made, 'No' otherwise.
     */
    public static String matchParens(String[] lst) {
        // Check if the input array has exactly 2 elements
        if (lst.length != 2) {
            throw new IllegalArgumentException("Input array must have exactly 2 elements");
        }

        // Define a helper function to check if a string is balanced
        return checkBalanced(lst[0] + lst[1]) || checkBalanced(lst[1] + lst[0]);
    }

    /**
     * Checks if a string of parentheses is balanced.
     *
     * @param s The input string.
     * @return True if the string is balanced, False otherwise.
     */
    private static boolean checkBalanced(String s) {
        int val = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                val++;
            } else if (c == ')') {
                val--;
            }
            if (val < 0) {
                return false;
            }
        }
        return val == 0;
    }
}