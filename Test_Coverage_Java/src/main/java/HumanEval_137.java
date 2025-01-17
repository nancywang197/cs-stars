public class Main {
    public static String compareOne(String a, String b) {
        // Convert strings to floats with comma as decimal point
        double tempA = convertToDouble(a);
        double tempB = convertToDouble(b);

        if (tempA == tempB) return null;
        else if (tempA > tempB) return a;
        else return b;
    }

    private static double convertToDouble(String str) {
        // Replace comma with dot to use with Java's double
        String formattedStr = str.replace(',', '.');
        return Double.parseDouble(formattedStr);
    }

    
}