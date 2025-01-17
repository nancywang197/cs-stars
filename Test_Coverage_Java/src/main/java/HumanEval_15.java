public class Main {
    public static String stringSequence(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            sb.append(i).append(" ");
        }
        return sb.toString().trim();
    }

    
}