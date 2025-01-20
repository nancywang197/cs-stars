import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_84Test {

    @Test
    public void testSolve() {
        HumanEval_84 solver = new HumanEval_84();
        assertEquals("1", solver.solve(1000));
        assertEquals("110", solver.solve(150));
        assertEquals("1100", solver.solve(147));
        assertEquals("1001", solver.solve(333));
        assertEquals("10010", solver.solve(963));
    }
}
