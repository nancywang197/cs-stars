import java.util.ArrayList;
import java.util.List;

public class Main {

    public static String fileNameCheck(String fileName) {
        // Define a list of supported suffixes
        List<String> suffixes = new ArrayList<>();
        suffixes.add("txt");
        suffixes.add("exe");
        suffixes.add("dll");

        // Split the file name by dot
        String[] parts = fileName.split("\\.");

        // Check if the file name has exactly two parts (file and suffix)
        if (parts.length != 2) {
            return "No";
        }

        // Get the first part of the file name
        String filename = parts[0];

        // Check if the first part is not empty
        if (filename.isEmpty()) {
            return "No";
        }

        // Check if the first part starts with a letter
        if (!Character.isLetter(filename.charAt(0))) {
            return "No";
        }

        // Count the number of digits in the file name
        int digitCount = 0;
        for (char c : filename.toCharArray()) {
            if (Character.isDigit(c)) {
                ++digitCount;
            }
        }

        // Check if more than three characters are digits
        if (digitCount > 3) {
            return "No";
        }

        // If all checks pass, the file name is valid
        return "Yes";
    }

    
}