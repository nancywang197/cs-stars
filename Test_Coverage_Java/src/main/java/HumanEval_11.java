public class Main {
    public static String stringXOR(String a, String b) {
        StringBuilder result = new StringBuilder();
        int maxLength = Math.max(a.length(), b.length());

        // Add leading zeros to shorter string if necessary
        for (int i = 0; i < maxLength - a.length(); i++) {
            a += '0';
        }
        for (int i = 0; i < maxLength - b.length(); i++) {
            b += '0';
        }

        // Calculate XOR of each character and join the results
        for (int i = 0; i < maxLength; i++) {
            result.append((a.charAt(i) ^ b.charAt(i)) == 65 ? "1" : "0");
        }

        return result.toString();
    }
}