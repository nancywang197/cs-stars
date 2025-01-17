import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval84Test {

    @Test
    public void test_HumanEval_84() {
 
        // Check some simple cases
        assertEquals("1", solve(1000), "Error");
        assertEquals("110", solve(150), "Error");
        assertEquals("1100", solve(147), "Error");
 
        // Check some edge cases that are easy to work out by hand.
        assertEquals("1001", solve(333), "Error");
        assertEquals("10010", solve(963), "Error");
    }
}