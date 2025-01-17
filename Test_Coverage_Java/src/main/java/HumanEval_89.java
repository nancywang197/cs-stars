public class HumanEval_89 {
    public static String encrypt(String s) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (alphabet.indexOf(c) != -1) { // Check if character is in alphabet
                int index = alphabet.indexOf(c);
                char shiftedChar = alphabet.charAt((index + 2 * 2) % 26); // Calculate the shifted index
                result.append(shiftedChar);
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    
}