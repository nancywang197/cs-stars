class HumanEval_140 {
    /**
     * Given a string, replace multiple spaces with either underscores or a hyphen.
     * If there are more than two spaces, replace them with a hyphen.
     * If there are one or two spaces, replace them with underscores.
     *
     * @param text The input string.
     * @return The modified string.
     */
    public String fix_spaces(String text) {
        String new_text = "";
        int i = 0;
        int start = 0;
        int end = 0;
        while (i < text.length()) {
            if (text.charAt(i) == ' ') {
                end++;
            } else {
                if (end - start > 2) {
                    new_text += "-" + text.charAt(i);
                } else if (end - start > 0) {
                    for (int j = 0; j < end - start; j++) {
                        new_text += "_";
                    }
                    new_text += text.charAt(i);
                } else {
                    new_text += text.charAt(i);
                }
                start = i + 1;
                end = i + 1;
            }
            i++;
        }
        if (end - start > 2) {
            new_text += "-";
        } else if (end - start > 0) {
            new_text += "_";
        }
        return new_text;
    }
}
