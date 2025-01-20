import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class HumanEval_68Test {

    @Test
    public void testPluck() {
        HumanEval_68 solution = new HumanEval_68();
        assertEquals(Arrays.asList(2, 1), solution.pluck(new int[]{4, 2, 3}));
        assertEquals(Arrays.asList(2, 1), solution.pluck(new int[]{1, 2, 3}));
        assertEquals(Arrays.asList(), solution.pluck(new int[]{}));
        assertEquals(Arrays.asList(0, 1), solution.pluck(new int[]{5, 0, 3, 0, 4, 2}));
        assertEquals(Arrays.asList(0, 3), solution.pluck(new int[]{1, 2, 3, 0, 5, 3}));
        assertEquals(Arrays.asList(4, 1), solution.pluck(new int[]{5, 4, 8, 4, 8}));
        assertEquals(Arrays.asList(6, 1), solution.pluck(new int[]{7, 6, 7, 1}));
        assertEquals(Arrays.asList(), solution.pluck(new int[]{7, 9, 7, 1}));
    }
}
