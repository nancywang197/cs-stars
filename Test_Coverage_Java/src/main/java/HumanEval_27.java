public class Main {
    public static String flipCase(String string) {
        return string.toLowerCase().replaceAll("[a-z]", match -> Character.toUpperCase(match.group(0)));
    }

    
}