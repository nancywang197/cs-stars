import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_161Test {

    HumanEval_161 solver = new HumanEval_161();

    @Test
    public void testSolve() {
        assertEquals(solver.solve("AsDf"), "aSdF");
        assertEquals(solver.solve("1234"), "4321");
        assertEquals(solver.solve("ab"), "AB");
        assertEquals(solver.solve("#a@C"), "#A@c");
        assertEquals(solver.solve("#AsdfW^45"), "#aSDFw^45");
        assertEquals(solver.solve("#6@2"), "2@6#");
        assertEquals(solver.solve("#$a^D"), "#$A^d");
        assertEquals(solver.solve("#ccc"), "#CCC");
    }
}
