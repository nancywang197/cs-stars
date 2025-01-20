import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_76Test {

    @Test
    public void testIsSimplePower() {
        HumanEval_76 tester = new HumanEval_76();
        assertEquals(true, tester.isSimplePower(16, 2));
        assertEquals(false, tester.isSimplePower(143214, 16));
        assertEquals(true, tester.isSimplePower(4, 2));
        assertEquals(true, tester.isSimplePower(9, 3));
        assertEquals(true, tester.isSimplePower(16, 4));
        assertEquals(false, tester.isSimplePower(24, 2));
        assertEquals(false, tester.isSimplePower(128, 4));
        assertEquals(false, tester.isSimplePower(12, 6));
        assertEquals(true, tester.isSimplePower(1, 1));
        assertEquals(true, tester.isSimplePower(1, 12));
    }
}
