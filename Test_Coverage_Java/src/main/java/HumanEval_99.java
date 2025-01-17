import java.util.regex.Pattern;

public class Main {
    public static int closestInteger(String value) {
        // Remove trailing zeros if present
        String tempValue = value;
        while (tempValue.endsWith("0")) {
            tempValue = tempValue.substring(0, tempValue.length() - 1);
        }

        double num = Double.parseDouble(tempValue);

        // If the number is equidistant from two integers, round away from zero
        if (value.endsWith(".5") && value.replaceFirst("\\.\\d", "").equals("0")) {
            if (num > 0) {
                return (int) Math.ceil(num);
            } else {
                return (int) Math.floor(num);
            }
        }

        // Use Java's built-in rounding mechanism
        return (int) Math.round(num);
    }

    
}