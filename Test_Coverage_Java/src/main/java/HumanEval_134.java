public class HumanEval_134 {
    public static boolean checkIfLastCharIsALetter(String txt) {
        String[] words = txt.split(" ");
        if (words.length == 0 || words[words.length - 1].length() == 0) {
            return false;
        }
        char lastChar = Character.toLowerCase(words[words.length - 1].charAt(0));
        return Character.isLetter(lastChar) && !Character.isLetterOrDigit(lastChar);
    }

    
}