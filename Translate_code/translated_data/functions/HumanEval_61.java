class HumanEval_61 {
    /**
     * Given a string of brackets, determine if the bracketing is correct.
     *
     * @param brackets The string of brackets.
     * @return True if the bracketing is correct, False otherwise.
     */
    public boolean correct_bracketing(String brackets) {
        int depth = 0;
        for (char b : brackets.toCharArray()) {
            if (b == '(') {
                depth += 1;
            } else {
                depth -= 1;
            }
            if (depth < 0) {
                return false;
            }
        }
        return depth == 0;
    }
}
