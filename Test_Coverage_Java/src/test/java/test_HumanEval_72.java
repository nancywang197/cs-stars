import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class HumanEval72Test {

    @Test
    public void testWillItFly_SimpleCases() {
        assertTrue(HumanEval_72.will_it_fly(new int[]{3, 2, 3}, 9));
        assertFalse(HumanEval_72.will_it_fly(new int[]{1, 2}, 5));
        assertTrue(HumanEval_72.will_it_fly(new int[]{3}, 5));
        assertFalse(HumanEval_72.will_it_fly(new int[]{3, 2, 3}, 1));
    }

    @Test
    public void testWillItFly_EdgeCases() {
        assertFalse(HumanEval_72.will_it_fly(new int[]{1, 2, 3}, 6));
        assertTrue(HumanEval_72.will_it_fly(new int[]{5}, 5));
    }
}