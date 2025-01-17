import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_6 {

    public int[] parseNestedParens(String str) {
        // Implementation of the function parse_nested_parens from your Python code here
        // For simplicity, let's assume it's a simple recursive function
        return new int[]{1, 2, 3}; // Replace with actual implementation
    }

    @Test
    public void test_HumanEval_6() {
        assertArrayEquals(new int[] {2, 3, 1, 3}, parseNestedParens("(()()) ((())) () ((())()())"));
        assertArrayEquals(new int[] {1, 2, 3, 4}, parseNestedParens("() (()) ((())) (((())))"));
        assertArrayEquals(new int[] {4}, parseNestedParens("(()(())((())))"));
    }
}