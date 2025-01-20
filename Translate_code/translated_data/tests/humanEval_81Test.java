import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class HumanEval_81Test {

    @Test
    public void testNumericalLetterGrade() {
        HumanEval_81 humanEval_81 = new HumanEval_81();
        assertEquals(Arrays.asList("A+", "B", "C-", "C", "A-"), humanEval_81.numerical_letter_grade(Arrays.asList(4.0, 3.0, 1.7, 2.0, 3.5)));
        assertEquals(Arrays.asList("D+"), humanEval_81.numerical_letter_grade(Arrays.asList(1.2)));
        assertEquals(Arrays.asList("D-"), humanEval_81.numerical_letter_grade(Arrays.asList(0.5)));
        assertEquals(Arrays.asList("E"), humanEval_81.numerical_letter_grade(Arrays.asList(0.0)));
        assertEquals(Arrays.asList("D", "D-", "C-", "B", "B+"), humanEval_81.numerical_letter_grade(Arrays.asList(1.0, 0.3, 1.5, 2.8, 3.3)));
        assertEquals(Arrays.asList("E", "D-"), humanEval_81.numerical_letter_grade(Arrays.asList(0.0, 0.7)));
    }
}
