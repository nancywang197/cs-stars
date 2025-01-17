import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval52Test {

    @Test
    public void test_HumanEval_52() {
        boolean result1 = belowThreshold(new int[]{1, 2, 4, 10}, 100);
        assertTrue(result1);

        boolean result2 = belowThreshold(new int[]{1, 20, 4, 10}, 5);
        assertFalse(result2);

        boolean result3 = belowThreshold(new int[]{1, 20, 4, 10}, 21);
        assertTrue(result3);

        boolean result4 = belowThreshold(new int[]{1, 20, 4, 10}, 22);
        assertTrue(result4);

        boolean result5 = belowThreshold(new int[]{1, 8, 4, 10}, 11);
        assertTrue(result5);

        boolean result6 = belowThreshold(new int[]{1, 8, 4, 10}, 10);
        assertFalse(result6);
    }

    // Note: belowThreshold method implementation is not provided here as it's assumed to be in another class (HumanEval_52.java)
}