public class Main {
    public static int countVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i += 2) {
            if ("AEIOU".indexOf(s.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    
}