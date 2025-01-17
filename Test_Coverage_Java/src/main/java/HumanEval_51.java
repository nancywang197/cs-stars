public class Main {
    public static String removeVowels(String text) {
        char[] vowels = {"a", "e", "i", "o", "u"};
        StringBuilder result = new StringBuilder();
        
        for (char c : text.toCharArray()) {
            if (!Character.isLetter(c) || Character.isWhitespace(c)) {
                result.append(c);
            }
            if (isVowel(c, vowels)) {
                continue;
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    private static boolean isVowel(char c, char[] vowels) {
        for (char vowel : vowels) {
            if (c == vowel || Character.toLowerCase(c) == vowel) {
                return true;
            }
        }
        return false;
    }

    
}