import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;

public class HumanEval_4Test {

    @Test
    public void testMeanAbsoluteDeviation1() {
        HumanEval_4 calculator = new HumanEval_4();
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0);
        double expected = 2.0 / 3.0;
        double result = calculator.mean_absolute_deviation(numbers);
        assertEquals(expected, result, 1e-6); 
    }

    @Test
    public void testMeanAbsoluteDeviation2() {
        HumanEval_4 calculator = new HumanEval_4();
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0);
        double expected = 1.0;
        double result = calculator.mean_absolute_deviation(numbers);
        assertEquals(expected, result, 1e-6);
    }

    @Test
    public void testMeanAbsoluteDeviation3() {
        HumanEval_4 calculator = new HumanEval_4();
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        double expected = 6.0 / 5.0;
        double result = calculator.mean_absolute_deviation(numbers);
        assertEquals(expected, result, 1e-6);
    }
}
