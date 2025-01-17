import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval_65Test {

    @Test
    public void test_HumanEval_65() {
        // Check some simple cases
        assertEquals("001", humanEval_65(100, 2));
        assertEquals("12", humanEval_65(12, 2));
        assertEquals("79", humanEval_65(97, 8));
        assertEquals("21", humanEval_65(12, 1));

        // Check some edge cases that are easy to work out by hand.
        assertEquals("11", humanEval_65(11, 101));
    }

    private String humanEval_65(int num, int shift) {
        return Integer.toString((num + shift) % 100);
    }
}