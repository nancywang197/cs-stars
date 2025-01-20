import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class HumanEval_109Test {

    @Test
    public void testMoveOneBall() {
        HumanEval_109 solver = new HumanEval_109();
        assertEquals(true, solver.moveOneBall(new int[]{3, 4, 5, 1, 2}));
        assertEquals(true, solver.moveOneBall(new int[]{3, 5, 10, 1, 2}));
        assertEquals(false, solver.moveOneBall(new int[]{4, 3, 1, 2}));
        assertEquals(false, solver.moveOneBall(new int[]{3, 5, 4, 1, 2}));
        assertEquals(true, solver.moveOneBall(new int[]{}));
    }
}
