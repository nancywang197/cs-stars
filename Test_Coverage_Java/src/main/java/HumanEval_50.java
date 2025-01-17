public class Main {

    public static String encodeShift(String s) {
        StringBuilder result = new StringBuilder();
        
        // Iterate over each character in the string
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) { // Check if the character is a letter
                int asciiOffset = Character.toLowerCase(ch) == ch ? 'a' : 'A';
                
                char shiftedChar = (char) (((ch - asciiOffset + 5) % 26) + asciiOffset);
                
                result.append(shiftedChar); // Append the shifted character to the result string
            } else {
                result.append(ch); // If not a letter, append as is
            }
        }

        return result.toString();
    }

    public static String decodeShift(String s) {
        return encodeShift(s.toLowerCase());
    }

    
}