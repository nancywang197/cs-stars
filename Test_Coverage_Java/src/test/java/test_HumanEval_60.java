import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval60Test {

    @Test
    public void testSumToN() {
        assertEquals(1, HumanEval60.sumToN(1));
        assertEquals(21, HumanEval60.sumToN(6));
        assertEquals(66, HumanEval60.sumToN(11));
        assertEquals(465, HumanEval60.sumToN(30));
        assertEquals(5050, HumanEval60.sumToN(100));
    }
}