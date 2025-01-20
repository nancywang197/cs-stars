import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class HumanEval_90Test {

    HumanEval_90 solver = new HumanEval_90();

    @Test
    public void testSimpleCases() {
        assertEquals(Integer.valueOf(2), solver.next_smallest(new Integer[]{1, 2, 3, 4, 5}));
        assertEquals(Integer.valueOf(2), solver.next_smallest(new Integer[]{5, 1, 4, 3, 2}));
        assertNull(solver.next_smallest(new Integer[0]));
        assertNull(solver.next_smallest(new Integer[]{1, 1}));
        assertEquals(Integer.valueOf(1), solver.next_smallest(new Integer[]{1, 1, 1, 1, 0}));
        assertNull(solver.next_smallest(new Integer[]{1, 1})); // 0**0 is 1, so this is the same as the previous case.
        assertEquals(Integer.valueOf(-35), solver.next_smallest(new Integer[]{-35, 34, 12, -45}));
    }


    @Test
    public void testTrue(){
        assertTrue(true);
    }
}
