import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval_120Test {

    @Test
    public void test_HumanEval_120_SimpleCases() {
        // Check some simple cases
        String[] expected = {"-4,-3,5", "4,4", "[2]", "20,123,2", "0,1,2,20", "-13,-8,0,3,5,15", "3,5", "5", "-4,4", "-10,10"};
        for (int i = 0; i < expected.length; i++) {
            String[] input = {String.valueOf(-3), String.valueOf(-4), String.valueOf(5), String.valueOf(4), String.valueOf(-4), 
                              String.valueOf(4), String.valueOf(123), String.valueOf(-123), String.valueOf(20), String.valueOf(0),
                              String.valueOf(1), String.valueOf(2), String.valueOf(-1), String.valueOf(-2), String.valueOf(1),
                              String.valueOf(5), String.valueOf(15), String.valueOf(0), String.valueOf(3), String.valueOf(-13),
                              String.valueOf(-8), String.valueOf(0), String.valueOf(4), String.valueOf(-10), 
                              String.valueOf(1), String.valueOf(2), String.valueOf(3), String.valueOf(-23), String.valueOf(243),
                              String.valueOf(-400), String.valueOf(0), "2"};
            String result = HumanEval_120.maximum(input, i + 1);
            assertEquals(expected[i], result);
        }
    }

    @Test
    public void test_HumanEval_120_EdgeCases() {
        // Check some edge cases that are easy to work out by hand.
        int[] input = {1, 2, 3, -23, 243, -400, 0};
        String result = HumanEval_120.maximum(input, 0);
        assertEquals("[]", result); 
    }
}