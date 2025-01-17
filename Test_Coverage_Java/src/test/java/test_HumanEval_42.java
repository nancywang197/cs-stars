import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval42Test {

    @Test
    public void test_IncrList_EmptyList_ReturnsEmptyList() {
        int[] expected = {};
        int[] result = HumanEval_42.incr_list(new int[0]);
        assertEquals(expected, result);
    }

    @Test
    public void test_IncrList_SingleElementList ReturnsCorrectlyIncrementedList() {
        int[] listToTest = {3};
        int[] expected = {4};
        int[] result = HumanEval_42.incr_list(listToTest);
        assertEquals(expected, result);
    }

    @Test
    public void test_IncrList_MultipleElementList_ReturnsCorrectlyIncrementedList() {
        int[] listToTest = {3, 2, 1};
        int[] expected = {4, 3, 2};
        int[] result = HumanEval_42.incr_list(listToTest);
        assertEquals(expected, result);
    }

    @Test
    public void test_IncrList_MultipleElementListWithDuplicatedElements_ReturnsCorrectlyIncrementedList() {
        int[] listToTest = {5, 2, 5, 2, 3, 3, 9, 0, 123};
        int[] expected = {6, 3, 6, 3, 4, 4, 10, 1, 124};
        int[] result = HumanEval_42.incr_list(listToTest);
        assertEquals(expected, result);
    }
}