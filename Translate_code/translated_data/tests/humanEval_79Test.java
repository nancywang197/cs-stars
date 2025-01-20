import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_79Test {

    HumanEval_79 converter = new HumanEval_79();

    @Test
    public void testDecimalToBinary() {
        assertEquals("db0db", converter.decimalToBinary(0));
        assertEquals("db100000db", converter.decimalToBinary(32));
        assertEquals("db1100111db", converter.decimalToBinary(103));
        assertEquals("db1111db", converter.decimalToBinary(15));
    }
}
