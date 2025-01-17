import java.util.HashMap;
import java.util.Map;

public class HumanEval_93 {
    public static String encode(String message) {
        // Define the vowel mapping
        Map<Character, Character> vowelMapping = new HashMap<>();
        for (char i : "aeiouAEIOU".toCharArray()) {
            vowelMapping.put(i, (char) (i + 2));
        }

        // Convert the message to a case-insensitive string
        StringBuilder builder = new StringBuilder();
        for (char c : message.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                builder.append(vowelMapping.get(Character.toLowerCase(c)));
            } else {
                builder.append(c);
            }
        }

        return builder.toString();
    }

    
}