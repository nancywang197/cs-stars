import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_97Test {

    HumanEval_97 multiplyer = new HumanEval_97();

    @Test
    public void testMultiply() {
        assertEquals(16, multiplyer.multiply(148, 412));
        assertEquals(72, multiplyer.multiply(19, 28));
        assertEquals(0, multiplyer.multiply(2020, 1851));
        assertEquals(20, multiplyer.multiply(14, -15));
        assertEquals(42, multiplyer.multiply(76, 67));
        assertEquals(49, multiplyer.multiply(17, 27));
        assertEquals(0, multiplyer.multiply(0, 1));
        assertEquals(0, multiplyer.multiply(0, 0));
    }
}
