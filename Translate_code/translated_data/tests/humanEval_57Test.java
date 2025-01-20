import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_57Test {

    @Test
    public void testMonotonic() {
        HumanEval_57 instance = new HumanEval_57();
        assertEquals(true, instance.monotonic(new int[] {1, 2, 4, 10}));
        assertEquals(true, instance.monotonic(new int[] {1, 2, 4, 20}));
        assertEquals(false, instance.monotonic(new int[] {1, 20, 4, 10}));
        assertEquals(true, instance.monotonic(new int[] {4, 1, 0, -10}));
        assertEquals(true, instance.monotonic(new int[] {4, 1, 1, 0}));
        assertEquals(false, instance.monotonic(new int[] {1, 2, 3, 2, 5, 60}));
        assertEquals(true, instance.monotonic(new int[] {1, 2, 3, 4, 5, 60}));
        assertEquals(true, instance.monotonic(new int[] {9, 9, 9, 9}));
    }
}
