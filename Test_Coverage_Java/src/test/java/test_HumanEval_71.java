import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval_71Test {

    @Test
    public void test_HumanEval_71() {
 
        // Check some simple cases
        assertEquals(6.00, triangleArea(3, 4, 5), 0.01);
        assertEquals(-1, triangleArea(1, 2, 10), 0.01);
        assertEquals(8.18, triangleArea(4, 8, 5), 0.01);
        assertEquals(1.73, triangleArea(2, 2, 2), 0.01);
        assertEquals(-1, triangleArea(1, 2, 3), 0.01);
        assertEquals(16.25, triangleArea(10, 5, 7), 0.01);
        assertEquals(-1, triangleArea(2, 6, 3), 0.01);
 
        // Check some edge cases that are easy to work out by hand.
        assertEquals(0.43, triangleArea(1, 1, 1), 0.01);
        assertEquals(-1, triangleArea(2, 2, 10), 0.01);
    }
}