import org.junit.Test;
import static org.junit.Assert.*;
import HumanEval_77;


public class HumanEval_77Test {
    HumanEval_77 func = new HumanEval_77();

    @Test
    public void testSimpleCases() {
        assertEquals(true, func.iscube(1));
        assertEquals(false, func.iscube(2));
        assertEquals(true, func.iscube(-1));
        assertEquals(true, func.iscube(64));
        assertEquals(false, func.iscube(180));
        assertEquals(true, func.iscube(1000));
    }

    @Test
    public void testEdgeCases() {
        assertEquals(true, func.iscube(0));
        assertEquals(false, func.iscube(1729));
    }
}
