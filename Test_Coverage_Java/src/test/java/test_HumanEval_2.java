import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_2Test {

    @Test
    public void test_HumanEval_2() {
        double result1 = HumanEval_2.truncateNumber(3.5);
        assertEquals(0.5, result1, 1e-6);

        double result2 = HumanEval_2.truncateNumber(1.33);
        assertEquals(Math.abs(result2 - 0.33), 1e-7, "The difference should be close to zero", false);
        
        double result3 = HumanEval_2.truncateNumber(123.456);
        assertEquals(Math.abs(result3 - 0.456), 1e-6, "The difference should be close to zero", false);
    }
}