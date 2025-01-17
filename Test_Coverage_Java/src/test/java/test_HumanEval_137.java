import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_137Test {

    @Test
    public void test_HumanEval_137() {
        // Check some simple cases
        assertEquals(2, compareOne(1, 2));
        assertEquals(2.5, compareOne(1, 2.5));
        assertEquals(3, compareOne(2, 3));
        assertEquals(6, compareOne(5, 6));
        assertEquals("2,3", compareOne(1, "2,3"));
        assertEquals("6", compareOne("5,1", "6"));
        assertEquals("2", compareOne("1", "2"));
        assertEquals(null, compareOne("1", 1));

        // Check some edge cases that are easy to work out by hand.
        assertTrue(true);
    }

    // Assuming this function is defined in HumanEval_137.java
    public static int compareOne(Object a, Object b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (int)a + (int)b;
        } else if (a instanceof String && b instanceof String) {
            return ((String)a).compareTo((String)b);
        } else if (a instanceof Integer && b instanceof String) {
            return compareOne(a, (int)b);
        } else if (a instanceof String && b instanceof Integer) {
            return compareOne((int)a, b);
        } else {
            return null;
        }
    }

}