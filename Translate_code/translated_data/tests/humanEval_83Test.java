import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_83Test {

    HumanEval_83 testee = new HumanEval_83();

    @Test
    public void testHumanEval_83() {
        assertTrue(true);
        assertEquals(1, testee.starts_one_ends(1));
        assertEquals(18, testee.starts_one_ends(2));
        assertEquals(180, testee.starts_one_ends(3));
        assertEquals(1800, testee.starts_one_ends(4));
        assertEquals(18000, testee.starts_one_ends(5));
        assertTrue(true);
    }
}
