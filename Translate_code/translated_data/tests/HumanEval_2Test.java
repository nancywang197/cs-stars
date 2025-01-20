import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_2Test {

    @Test
    public void testTruncateNumber1() {
        HumanEval_2 truncate = new HumanEval_2();
        assertEquals(0.5, truncate.truncate_number(3.5), 1e-6); 
    }

    @Test
    public void testTruncateNumber2() {
        HumanEval_2 truncate = new HumanEval_2();
        assertTrue(Math.abs(truncate.truncate_number(1.33) - 0.33) < 1e-6);
    }

    @Test
    public void testTruncateNumber3() {
        HumanEval_2 truncate = new HumanEval_2();
        assertTrue(Math.abs(truncate.truncate_number(123.456) - 0.456) < 1e-6);
    }
}
