import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_98Test {

    HumanEval_98 countUpper = new HumanEval_98();

    @Test
    public void testCountUpper() {
        assertEquals(1, countUpper.count_upper("aBCdEf"));
        assertEquals(0, countUpper.count_upper("abcdefg"));
        assertEquals(0, countUpper.count_upper("dBBE"));
        assertEquals(0, countUpper.count_upper("B"));
        assertEquals(1, countUpper.count_upper("U"));
        assertEquals(0, countUpper.count_upper(""));
        assertEquals(2, countUpper.count_upper("EEEE"));
    }
}
