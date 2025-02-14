package com.example.python_to_java.functions_copy;
import java.util.Map;
import java.util.HashMap;
public class HumanEval_93 {
    /**
     * Encodes a message by replacing vowels with their ASCII-shifted counterparts and swapping the case of all characters.
     *
     * @param message The input message string.
     * @return The encoded message string.
     */
    public String encode(String message) {
        String vowels = "aeiouAEIOU";
        Map<Character, Character> vowelsReplace = new HashMap<>();
        for (char i : vowels.toCharArray()) {
            vowelsReplace.put(i, (char) (i + 2));
        }
        StringBuilder sb = new StringBuilder();
        for (char c : message.toCharArray()) {
            char ch = Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c);
            sb.append(vowelsReplace.getOrDefault(ch, ch));
        }
        return sb.toString();
    }
}
