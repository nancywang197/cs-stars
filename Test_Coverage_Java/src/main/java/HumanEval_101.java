public class Main {
    public static String wordsString(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == ',') {
                sb.append(' ');
            } else {
                sb.append(c);
            }
        }

        String result = sb.toString();
        return result.split("\\s+").length > 1 ? result : "";
    }

    
}