public class HumanEval_143 {
    public static String wordsInSentence(String sentence) {
        String[] words = sentence.split("\\s+");
        List<String> newLst = new ArrayList<>();

        for (String word : words) {
            boolean flg = false;
            if (word.length() == 1) {
                flg = true;
            }
            for (int i = 2; i <= word.length(); i++) {
                if (word.length() % i == 0) {
                    flg = true;
                }
            }
            if (!flg || word.length() == 2) {
                newLst.add(word);
            }
        }

        StringBuilder result = new StringBuilder();
        for (String w : newLst) {
            result.append(w).append(" ");
        }

        return result.toString().trim();
    }

    
}