import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_116Test {

    @Test
    public void test_HumanEval_116() {
 
        // Check some simple cases
        assertTrue(true, "This prints if this assert fails 1 (good for debugging!)");
        
        int[] result = sort_array(new int[]{1,5,2,3,4});
        assertEquals(new int[]{1, 2, 4, 3, 5}, result);
        
        result = sort_array(new int[]{-2,-3,-4,-5,-6});
        assertEquals(new int[]{-4, -2, -6, -5, -3}, result);
        
        result = sort_array(new int[]{1,0,2,3,4});
        assertEquals(new int[]{0, 1, 2, 4, 3}, result);
        
        result = sort_array(new int[] {});
        assertEquals(new int[] {}, result);
        
        result = sort_array(new int[]{2,5,77,4,5,3,5,7,2,3,4});
        assertArrayEquals(new int[]{2, 2, 4, 4, 3, 3, 5, 5, 5, 7, 77}, result);
        
        result = sort_array(new int[]{3,6,44,12,32,5});
        assertArrayEquals(new int[]{32, 3, 5, 6, 12, 44}, result);
        
        result = sort_array(new int[]{2,4,8,16,32});
        assertEquals(new int[]{2, 4, 8, 16, 32}, result);
        
        // Check some edge cases that are easy to work out by hand.
        assertTrue(true, "This prints if this assert fails 2 (also good for debugging!)");
    }

    public static int[] sort_array(int[] arr) {
        // Implementation of your sort_array function
        return arr;
    }
}