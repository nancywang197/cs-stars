import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;


public class HumanEval_47Test {

    @Test
    public void testMedian() {
        HumanEval_47 medianCalculator = new HumanEval_47();
        assertEquals(3.0, medianCalculator.median(Arrays.asList(3.0, 1.0, 2.0, 4.0, 5.0)), 0.001);
        assertEquals(8.0, medianCalculator.median(Arrays.asList(-10.0, 4.0, 6.0, 1000.0, 10.0, 20.0)), 0.001);
        assertEquals(5.0, medianCalculator.median(Arrays.asList(5.0)), 0.001);
        assertEquals(5.5, medianCalculator.median(Arrays.asList(6.0, 5.0)), 0.001);
        assertEquals(7.0, medianCalculator.median(Arrays.asList(8.0, 1.0, 3.0, 9.0, 9.0, 2.0, 7.0)), 0.001);
    }
}
