import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_60Test {
    @Test
    public void testSumToN() {
        HumanEval_60 solver = new HumanEval_60();
        assertEquals(1, solver.sum_to_n(1));
        assertEquals(21, solver.sum_to_n(6));
        assertEquals(66, solver.sum_to_n(11));
        assertEquals(465, solver.sum_to_n(30));
        assertEquals(5050, solver.sum_to_n(100));
    }
}
