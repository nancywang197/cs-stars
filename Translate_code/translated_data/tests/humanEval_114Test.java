import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_114Test {

    @Test
    public void testMinSubArraySum() {
        HumanEval_114 solver = new HumanEval_114();
        assertEquals(solver.minSubArraySum(new int[]{2, 3, 4, 1, 2, 4}), 1);
        assertEquals(solver.minSubArraySum(new int[]{-1, -2, -3}), -6);
        assertEquals(solver.minSubArraySum(new int[]{-1, -2, -3, 2, -10}), -14);
        assertEquals(solver.minSubArraySum(new int[]{-9999999999999999}), -9999999999999999);
        assertEquals(solver.minSubArraySum(new int[]{0, 10, 20, 1000000}), 0);
        assertEquals(solver.minSubArraySum(new int[]{-1, -2, -3, 10, -5}), -6);
        assertEquals(solver.minSubArraySum(new int[]{100, -1, -2, -3, 10, -5}), -6);
        assertEquals(solver.minSubArraySum(new int[]{10, 11, 13, 8, 3, 4}), 3);
        assertEquals(solver.minSubArraySum(new int[]{100, -33, 32, -1, 0, -2}), -33);
        assertEquals(solver.minSubArraySum(new int[]{-10}), -10);
        assertEquals(solver.minSubArraySum(new int[]{7}), 7);
        assertEquals(solver.minSubArraySum(new int[]{1, -1}), -1);
    }
}
