import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;

public class HumanEval_62Test {
    @Test
    public void testDerivative1() {
        HumanEval_62 der = new HumanEval_62();
        List<Integer> input = Arrays.asList(3, 1, 2, 4, 5);
        List<Integer> expected = Arrays.asList(1, 4, 12, 20);
        assertEquals(expected, der.derivative(input));
    }

    @Test
    public void testDerivative2() {
        HumanEval_62 der = new HumanEval_62();
        List<Integer> input = Arrays.asList(1, 2, 3);
        List<Integer> expected = Arrays.asList(2, 6);
        assertEquals(expected, der.derivative(input));
    }

    @Test
    public void testDerivative3() {
        HumanEval_62 der = new HumanEval_62();
        List<Integer> input = Arrays.asList(3, 2, 1);
        List<Integer> expected = Arrays.asList(2, 2);
        assertEquals(expected, der.derivative(input));
    }

    @Test
    public void testDerivative4() {
        HumanEval_62 der = new HumanEval_62();
        List<Integer> input = Arrays.asList(3, 2, 1, 0, 4);
        List<Integer> expected = Arrays.asList(2, 2, 0, 16);
        assertEquals(expected, der.derivative(input));
    }

    @Test
    public void testDerivative5() {
        HumanEval_62 der = new HumanEval_62();
        List<Integer> input = Arrays.asList(1);
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, der.derivative(input));
    }
}
