import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval72Test {

    @Test
    public void testWillItFly() {
        HumanEval_72 willItFly = new HumanEval_72();

        assertEquals(true, willItFly.will_it_fly(new int[]{3, 2, 3}, 9));
        assertEquals(false, willItFly.will_it_fly(new int[]{1, 2}, 5));
        assertEquals(true, willItFly.will_it_fly(new int[]{3}, 5));
        assertEquals(false, willItFly.will_it_fly(new int[]{3, 2, 3}, 1));
        assertEquals(false, willItFly.will_it_fly(new int[]{1, 2, 3}, 6));
        assertEquals(true, willItFly.will_it_fly(new int[]{5}, 5));
    }
}
