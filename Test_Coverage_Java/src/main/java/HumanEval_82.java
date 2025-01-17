public class HumanEval_82 {
    public static boolean primeLength(String string) {
        int length = string.length();
        if (length <= 1) {
            return false;
        }
        for (int i = 2; i < length; i++) {
            if (length % i == 0) {
                return false;
            }
        }
        return true;
    }

    
}