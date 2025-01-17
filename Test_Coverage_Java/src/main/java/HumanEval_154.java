public class HumanEval_154 {
    public static boolean cycPatternCheck(String a, String b) {
        int lenB = b.length();
        String[] patterns = {b, b + b};

        for (int i = 0; i < a.length() - lenB + 1; i++) {
            for (String pattern : patterns) {
                if (a.substring(i, i + lenB).equals(pattern)) {
                    return true;
                }
            }
        }

        return false;
    }

    
}