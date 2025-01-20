import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_91Test {

    @Test
    public void testIsBored() {
        HumanEval_91 tester = new HumanEval_91();
        assertEquals(0, tester.is_bored("Hello world"));
        assertEquals(0, tester.is_bored("Is the sky blue?"));
        assertEquals(1, tester.is_bored("I love It !"));
        assertEquals(0, tester.is_bored("bIt"));
        assertEquals(2, tester.is_bored("I feel good today. I will be productive. will kill It"));
        assertEquals(0, tester.is_bored("You and I are going for a walk"));
    }
}
