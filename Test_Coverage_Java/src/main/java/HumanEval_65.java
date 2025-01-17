public class Main {
    public static String circularShift(String x, int shift) {
        if (shift >= x.length()) {
            return new StringBuilder(x).reverse().toString();
        } else {
            return x.substring(x.length() - shift) + x.substring(0, x.length() - shift);
        }
    }

    
}