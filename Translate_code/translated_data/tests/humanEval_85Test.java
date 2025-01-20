import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_85Test {

    HumanEval_85 adder = new HumanEval_85();

    @Test
    public void testSimpleCases() {
        assertEquals(88, adder.add(new int[]{4, 88}));
        assertEquals(122, adder.add(new int[]{4, 5, 6, 7, 2, 122}));
        assertEquals(0, adder.add(new int[]{4, 0, 6, 7}));
        assertEquals(12, adder.add(new int[]{4, 4, 6, 8}));
    }

}
