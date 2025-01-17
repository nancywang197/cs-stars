import java.util.HashSet;

public class Main {
    public static String getClosestVowel(String word) {
        if (word.length() < 3) {
            return "";
        }

        HashSet<Character> vowels = new HashSet<>();
        for (char c : "aeiouAEIOU".toCharArray()) {
            vowels.add(c);
        }
        
        for (int i = word.length() - 2; i > 0; i--) {
            if (vowels.contains(word.charAt(i))) {
                if ((i + 1 <= word.length() && !vowels.contains(word.charAt(i + 1)))
                        && (i - 1 >= 0 && !vowels.contains(word.charAt(i - 1)))) {
                    return String.valueOf(word.charAt(i));
                }
            }
        }

        return "";
    }

    
}