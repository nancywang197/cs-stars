public class HumanEval_140 {
    public static String fixSpaces(String text) {
        StringBuilder newText = new StringBuilder();
        int start = 0;
        int end = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                end++;
            } else {
                if (end - start > 2) {
                    newText.append("-");
                }
                if (end - start > 0) {
                    newText.append("_").repeat(end - start);
                }
                newText.append(text.charAt(i));
                start = i + 1;
                end = i + 1;
            }
        }

        if (end - start > 2) {
            newText.append("-");
        } else if (end - start > 0) {
            newText.append("_");
        }
        return newText.toString();
    }

    
}