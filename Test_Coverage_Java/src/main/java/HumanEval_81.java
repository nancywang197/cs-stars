import java.util.ArrayList;

public class Main {
    public static String[] numericalLetterGrade(double[] grades) {
        
        ArrayList<String> letterGrade = new ArrayList<>();
        
        for (double gpa : grades) {
            if (gpa == 4.0) {
                letterGrade.add("A+");
            } else if (gpa > 3.7) {
                letterGrade.add("A");
            } else if (gpa > 3.3) {
                letterGrade.add("A-");
            } else if (gpa > 3.0) {
                letterGrade.add("B+");
            } else if (gpa > 2.7) {
                letterGrade.add("B");
            } else if (gpa > 2.3) {
                letterGrade.add("B-");
            } else if (gpa > 2.0) {
                letterGrade.add("C+");
            } else if (gpa > 1.7) {
                letterGrade.add("C");
            } else if (gpa > 1.3) {
                letterGrade.add("C-");
            } else if (gpa > 1.0) {
                letterGrade.add("D+");
            } else if (gpa > 0.7) {
                letterGrade.add("D");
            } else if (gpa > 0.0) {
                letterGrade.add("D-");
            } else {
                letterGrade.add("E");
            }
        }
        
        String[] result = new String[letterGrade.size()];
        for (int i = 0; i < letterGrade.size(); i++) {
            result[i] = letterGrade.get(i);
        }
        
        return result;
    }


}