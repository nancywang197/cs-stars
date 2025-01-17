import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class HumanEval_22Test {

    @Test
    public void test_HumanEval_22_EmptyList_ReturnsEmptyList() {
        List<Integer> result = filterIntegers(new ArrayList<>());
        assertEquals([], result);
    }

    @Test
    public void test_HumanEval_22_SimpleFiltering_ReturnsFilteredNumbers() {
        List<Integer> result = filterIntegers(Arrays.asList(4, 23.2, 9));
        assertTrue(result.contains(4) && result.contains(9));
    }

    @Test
    public void test_HumanEval_22_MultipleFilters_ReturnsAllFilteredNumbers() {
        List<Integer> result = filterIntegers(Arrays.asList(3, 'c', 3, 3, 'a', 'b'));
        assertTrue(result.contains(3) && result.contains(3) && result.contains(3));
    }
}