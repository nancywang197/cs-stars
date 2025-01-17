public class HumanEval_64 {
    public static int countVowels(String s) {
        String vowels = "aeiouAEIOU";
        int nVowels = 0;
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                nVowels++;
            } else if (c == 'y' || c == 'Y') {
                nVowels++;
            }
        }
        return nVowels;
    }

    
}