public class Main {
    public static String anti_shuffle(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            result.append(new String(chars)).append(" ");
        }

        return result.toString().trim();
    }

    
}