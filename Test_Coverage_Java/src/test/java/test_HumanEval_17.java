import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval17Test {

    @Test
    public void test_HumanEval_17_emptyInput() {
        String input = "";
        int[] expectedOutput = new int[0];
        int[] actualOutput = parseMusic(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_HumanEval_17_multipleO() {
        String input = "o o o o";
        int[] expectedOutput = {4, 4, 4, 4};
        int[] actualOutput = parseMusic(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_HumanEval_17_multipleDot() {
        String input = ".| .| .| .|";
        int[] expectedOutput = {1, 1, 1, 1};
        int[] actualOutput = parseMusic(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_HumanEval_17_multipleCombinations() {
        String input = "o| o| .| .| o o o o";
        int[] expectedOutput = {2, 2, 1, 1, 4, 4, 4, 4};
        int[] actualOutput = parseMusic(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_HumanEval_17_multipleCombinationsWithoutO() {
        String input = "o| .| o| .| o o| o o|";
        int[] expectedOutput = {2, 1, 2, 1, 4, 2, 4, 2};
        int[] actualOutput = parseMusic(input);
        assertEquals(expectedOutput, actualOutput);
    }

}