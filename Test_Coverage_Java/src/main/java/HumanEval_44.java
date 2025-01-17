public class HumanEval_44 {
    public static String changeBase(int x, int base) {
        StringBuilder ret = new StringBuilder();
        
        while (x > 0) {
            // Convert to string and append to the result
            ret.insert(0, String.valueOf(x % base));
            x /= base;
        }
        return ret.toString();
    }

    
}