import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HumanEval_22Test {
    @Test
    public void testFilterIntegersEmptyList() {
        HumanEval_22 filter = new HumanEval_22();
        List<Object> input = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, filter.filterIntegers(input));
    }

    @Test
    public void testFilterIntegersMixedList() {
        HumanEval_22 filter = new HumanEval_22();
        List<Object> input = new ArrayList<>(Arrays.asList(4, new Object(), new ArrayList<>(), 23.2, 9, "adasd"));
        List<Integer> expected = new ArrayList<>(Arrays.asList(4, 9));
        assertEquals(expected, filter.filterIntegers(input));
    }

    @Test
    public void testFilterIntegersStringAndIntegers() {
        HumanEval_22 filter = new HumanEval_22();
        List<Object> input = new ArrayList<>(Arrays.asList(3, 'c', 3, 3, 'a', 'b'));
        List<Integer> expected = new ArrayList<>(Arrays.asList(3, 3, 3));
        assertEquals(expected, filter.filterIntegers(input));
    }
}
