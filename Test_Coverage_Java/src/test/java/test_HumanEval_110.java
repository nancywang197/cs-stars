import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_110Test {

    @Test
    public void test_HumanEval_110() {
 
        // Check some simple cases
        String result = exchange(new int[] {1, 2, 3, 4}, new int[] {1, 2, 3, 4});
        assertEquals("YES", result);
        
        result = exchange(new int[] {1, 2, 3, 4}, new int[] {1, 5, 3, 4});
        assertEquals("NO", result);
        
        result = exchange(new int[] {1, 2, 3, 4}, new int[] {2, 1, 4, 3});
        assertEquals("YES", result);
        
        result = exchange(new int[] {5, 7, 3}, new int[] {2, 6, 4});
        assertEquals("YES", result);
        
        result = exchange(new int[] {5, 7, 3}, new int[] {2, 6, 3});
        assertEquals("NO", result);
        
        result = exchange(new int[] {3, 2, 6, 1, 8, 9}, new int[] {3, 5, 5, 1, 1, 1});
        assertEquals("NO", result);
 
        // Check some edge cases that are easy to work out by hand.
        result = exchange(new int[] {100, 200}, new int[] {200, 200});
        assertEquals("YES", result);
    }

    public String exchange(int[] a, int[] b) {
        // Implementation of the function goes here
        return "Implement your logic here";
    }
}