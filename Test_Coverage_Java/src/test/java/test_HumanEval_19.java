import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval_19Test {

    @Test
    public void test_HumanEval_19_EmptyInput_ReturnsEmptyString() {
        String input = "";
        String expectedOutput = "";
        assertEquals(expectedOutput, HumanEval_19.sortNumbers(input));
    }

    @Test
    public void test_HumanEval_19_SingleNumber_ReturnsSameNumber() {
        String input = "three";
        String expectedOutput = "three";
        assertEquals(expectedOutput, HumanEval_19.sortNumbers(input));
    }

    @Test
    public void test_HumanEval_19_MultipleNumbers_ReturnsCorrectOrder() {
        String input = "three five nine";
        String expectedOutput = "three five nine";
        assertEquals(expectedOutput, HumanEvall_19.sortNumbers(input));
    }

    @Test
    public void test_HumanEval_19_LargeInput_ReturnsCorrectOrder() {
        String input = "five zero four seven eight nine";
        String expectedOutput = "zero four five seven eight nine";
        assertEquals(expectedOutput, HumanEval_19.sortNumbers(input));
    }

    @Test
    public void test_HumanEval_19_GreatestInput_ReturnsCorrectOrder() {
        String input = "six five four three two one zero";
        String expectedOutput = "zero one two three four five six";
        assertEquals(expectedOutput, HumanEval_19.sortNumbers(input));
    }
}