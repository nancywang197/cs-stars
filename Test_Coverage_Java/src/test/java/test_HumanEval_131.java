import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_131Test {

    @Test
    public void test_HumanEval_131() {
 
        // Check some simple cases
        assertEquals(5, HumanEval_131.digits(5));
        assertEquals(5, HumanEval_131.digits(54));
        assertEquals(1, HumanEval_131.digits(120));
        assertEquals(5, HumanEval_131.digits(5014));
        assertEquals(315, HumanEval_131.digits(98765));
        assertEquals(2625, HumanEval_131.digits(5576543));
 
        // Check some edge cases that are easy to work out by hand.
        assertEquals(0, HumanEval_131.digits(2468)); 
    }
}