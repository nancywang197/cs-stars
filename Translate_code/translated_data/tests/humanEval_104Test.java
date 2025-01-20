import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class HumanEval_104Test {

    @Test
    public void testUniqueDigits() {
        HumanEval_104 uniqueDigits = new HumanEval_104();
        assertEquals(Arrays.asList(1, 15, 33), uniqueDigits.uniqueDigits(Arrays.asList(15, 33, 1422, 1)));
        assertEquals(Arrays.asList(), uniqueDigits.uniqueDigits(Arrays.asList(152, 323, 1422, 10)));
        assertEquals(Arrays.asList(111, 151), uniqueDigits.uniqueDigits(Arrays.asList(12345, 2033, 111, 151)));
        assertEquals(Arrays.asList(31, 135), uniqueDigits.uniqueDigits(Arrays.asList(135, 103, 31)));
    }
}
