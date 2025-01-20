import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class HumanEval_21Test {

    @Test
    public void testRescaleToUnit1() {
        HumanEval_21 rescaler = new HumanEval_21();
        List<Float> input = new ArrayList<>(Arrays.asList(2.0f, 49.9f));
        List<Float> expected = new ArrayList<>(Arrays.asList(0.0f, 1.0f));
        assertEquals(expected, rescaler.rescale_to_unit(input));
    }

    @Test
    public void testRescaleToUnit2() {
        HumanEval_21 rescaler = new HumanEval_21();
        List<Float> input = new ArrayList<>(Arrays.asList(100.0f, 49.9f));
        List<Float> expected = new ArrayList<>(Arrays.asList(1.0f, 0.0f));
        assertEquals(expected, rescaler.rescale_to_unit(input));
    }

    @Test
    public void testRescaleToUnit3() {
        HumanEval_21 rescaler = new HumanEval_21();
        List<Float> input = new ArrayList<>(Arrays.asList(1.0f, 2.0f, 3.0f, 4.0f, 5.0f));
        List<Float> expected = new ArrayList<>(Arrays.asList(0.0f, 0.25f, 0.5f, 0.75f, 1.0f));
        assertEquals(expected, rescaler.rescale_to_unit(input));
    }

    @Test
    public void testRescaleToUnit4() {
        HumanEval_21 rescaler = new HumanEval_21();
        List<Float> input = new ArrayList<>(Arrays.asList(2.0f, 1.0f, 5.0f, 3.0f, 4.0f));
        List<Float> expected = new ArrayList<>(Arrays.asList(0.25f, 0.0f, 1.0f, 0.5f, 0.75f));
        assertEquals(expected, rescaler.rescale_to_unit(input));
    }

    @Test
    public void testRescaleToUnit5() {
        HumanEval_21 rescaler = new HumanEval_21();
        List<Float> input = new ArrayList<>(Arrays.asList(12.0f, 11.0f, 15.0f, 13.0f, 14.0f));
        List<Float> expected = new ArrayList<>(Arrays.asList(0.25f, 0.0f, 1.0f, 0.5f, 0.75f));
        assertEquals(expected, rescaler.rescale_to_unit(input));
    }
}
