import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval_146Test {

    @Test
    public void test_HumanEval_146_SimpleCases() {
        // Check some simple cases
        assertEquals(0, humanEval_146(new int[] {5, -2, 1, -5}));
        assertEquals(1, humanEval_146(new int[] {15, -73, 14, -15}));
        assertEquals(2, humanEval_146(new int[] {33, -2, -3, 45, 21, 109}));
        assertEquals(4, humanEval_146(new int[] {43, -12, 93, 125, 121, 109}));
        assertEquals(3, humanEval_146(new int[] {71, -2, -33, 75, 21, 19}));
    }

    @Test
    public void test_HumanEval_146_EdgeCases() {
        // Check some edge cases that are easy to work out by hand.
        assertEquals(0, humanEval_146(new int[] {1}));
        assertEquals(0, humanEval_146(new int[0]));
    }
}