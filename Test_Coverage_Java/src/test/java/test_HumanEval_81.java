import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval81Test {

    @Test
    public void test_HumanEval_81() {
 
        // Check some simple cases
        String[] expected1 = {"A+", "B", "C-", "C", "A-"};
        String[] result1 = numericalLetterGrade(new double[]{4.0, 3, 1.7, 2, 3.5});
        assertEquals(expected1, result1);
 
        String[] expected2 = {"D+"};
        String[] result2 = numericalLetterGrade(new double[]{1.2});
        assertEquals(expected2, result2);
 
        String[] expected3 = {"D-", "E"};
        String[] result3 = numericalLetterGrade(new double[]{0.5, 0.7});
        assertEquals(expected3, result3);
 
        String[] expected4 = {"A", "B", "C", "D", "F"};
        String[] result4 = numericalLetterGrade(new double[]{1, 2, 1.5, 2.8, 3.3});
        assertEquals(expected4, result4);
    }

    // Assuming you have this method in HumanEval_81 class
    public static String[] numericalLetterGrade(double[] grades) {
        // Implementation of the numericalLetterGrade method
        String[] result = new String[grades.length];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 90.0) {
                result[i] = "A+";
            } else if (grades[i] >= 80.0 && grades[i] <= 89.9) {
                result[i] = "A";
            } else if (grades[i] >= 70.0 && grades[i] <= 79.9) {
                result[i] = "B";
            } else if (grades[i] >= 60.0 && grades[i] <= 69.9) {
                result[i] = "C";
            } else if (grades[i] >= 50.0 && grades[i] <= 59.9) {
                result[i] = "D";
            } else if (grades[i] >= 40.0 && grades[i] <= 49.9) {
                result[i] = "F";
            } else {
                result[i] = "E"; // or you can throw an exception for invalid input
            }
        }
        return result;
    }
}