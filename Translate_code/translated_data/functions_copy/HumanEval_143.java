package com.example.python_to_java.functions_copy;
public class HumanEval_143 {
    /**
     * Given a sentence, return a new sentence containing only the words
     * whose length is either 1 or a prime number.
     *
     * @param sentence The input sentence.
     * @return The new sentence.
     */
    public String wordsInSentence(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            int len = word.length();
            boolean flag = false;
            if (len == 1) {
                flag = true;
            } else {
                for (int i = 2; i < len; i++) {
                    if (len % i == 0) {
                        flag = true;
                        break;
                    }
                }
                if(len == 2) flag = false;
            }

            if (!flag) {
                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }
}
