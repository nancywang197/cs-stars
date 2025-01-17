import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval88Test {

    @Test
    public void test_HumanEval_88() {
        // Check some simple cases
        System.out.println("This prints if this assert fails 1 (good for debugging!)");
        assertEquals(true, true);
        
        Object[] expectedArray = {};
        Object[] actualArray = HumanEval88.sort_array(expectedArray);
        assertEquals(expectedArray, actualArray, "Error");
        
        expectedArray = new Object[]{5};
        actualArray = HumanEval88.sort_array(expectedArray);
        assertEquals(expectedArray, actualArray, "Error");
        
        expectedArray = new Object[]{2, 4, 3, 0, 1, 5};
        actualArray = HumanEval88.sort_array(expectedArray);
        assertEquals(new Object[]{0, 1, 2, 3, 4, 5}, actualArray, "Error");
        
        expectedArray = new Object[]{2, 4, 3, 0, 1, 5, 6};
        actualArray = HumanEval88.sort_array(expectedArray);
        assertEquals(new Object[]{6, 5, 4, 3, 2, 1}, actualArray, "Error");

        // Check some edge cases that are easy to work out by hand.
        System.out.println("This prints if this assert fails 2 (also good for debugging!)");
        assertEquals(true, true);
        
        expectedArray = new Object[]{2, 1};
        actualArray = HumanEval88.sort_array(expectedArray);
        assertEquals(new Object[]{1, 2}, actualArray, "Error");
        
        expectedArray = new Object[]{15, 42, 87, 32 ,11, 0};
        actualArray = HumanEval88.sort_array(expectedArray);
        assertEquals(new Object[]{0, 11, 15, 32, 42, 87}, actualArray, "Error");
        
        expectedArray = new Object[]{21, 14, 23, 11};
        actualArray = HumanEval88.sort_array(expectedArray);
        assertEquals(new Object[]{23, 21, 14, 11}, actualArray, "Error");

    }

}