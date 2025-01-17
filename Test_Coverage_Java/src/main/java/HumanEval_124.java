import java.time.LocalDate;
import java.time.DateTimeException;

public class HumanEval_124 {
    public static boolean validDate(String date) {
        try {
            // Convert input string to lower case to handle different month and day representations (e.g., 2/28 vs. February 28)
            String[] parts = date.split("-");
            int year = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]) - 1;  // Since months are zero-based in Java
            int day = Integer.parseInt(parts[2]);

            LocalDate dateObj = LocalDate.of(year, month + 1, day);
            return !dateObj.isBefore(LocalDate.now()) && !dateObj.isAfter(LocalDate.now());
        } catch (NumberFormatException e) {
            return false;
        }
    }

    
}