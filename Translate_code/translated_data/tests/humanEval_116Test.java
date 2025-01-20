import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class HumanEval_116Test {

    @Test
    public void testSortArray() {
        HumanEval_116 sorter = new HumanEval_116();
        assertArrayEquals(new int[]{1, 2, 4, 3, 5}, sorter.sort_array(new int[]{1, 5, 2, 3, 4}));
        assertArrayEquals(new int[]{-4, -2, -6, -5, -3}, sorter.sort_array(new int[]{-2, -3, -4, -5, -6}));
        assertArrayEquals(new int[]{0, 1, 2, 4, 3}, sorter.sort_array(new int[]{1, 0, 2, 3, 4}));
        assertArrayEquals(new int[]{}, sorter.sort_array(new int[]{}));
        assertArrayEquals(new int[]{2, 2, 4, 4, 3, 3, 5, 5, 5, 7, 77}, sorter.sort_array(new int[]{2, 5, 77, 4, 5, 3, 5, 7, 2, 3, 4}));
        assertArrayEquals(new int[]{32, 3, 5, 6, 12, 44}, sorter.sort_array(new int[]{3, 6, 44, 12, 32, 5}));
        assertArrayEquals(new int[]{2, 4, 8, 16, 32}, sorter.sort_array(new int[]{2, 4, 8, 16, 32}));
        assertArrayEquals(new int[]{2, 4, 8, 16, 32}, sorter.sort_array(new int[]{2, 4, 8, 16, 32}));
    }
}
