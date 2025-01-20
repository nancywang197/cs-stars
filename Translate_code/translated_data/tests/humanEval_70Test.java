import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class HumanEval_70Test {

    @Test
    public void testStrangeSortList() {
        HumanEval_70 solution = new HumanEval_70();
        assertEquals(Arrays.asList(1, 4, 2, 3), solution.strange_sort_list(Arrays.asList(1, 2, 3, 4)));
        assertEquals(Arrays.asList(5, 9, 6, 8, 7), solution.strange_sort_list(Arrays.asList(5, 6, 7, 8, 9)));
        assertEquals(Arrays.asList(1, 5, 2, 4, 3), solution.strange_sort_list(Arrays.asList(1, 2, 3, 4, 5)));
        assertEquals(Arrays.asList(1, 9, 5, 8, 6, 7), solution.strange_sort_list(Arrays.asList(5, 6, 7, 8, 9, 1)));
        assertEquals(Arrays.asList(5, 5, 5, 5), solution.strange_sort_list(Arrays.asList(5, 5, 5, 5)));
        assertEquals(Arrays.asList(), solution.strange_sort_list(Arrays.asList()));
        assertEquals(Arrays.asList(1, 8, 2, 7, 3, 6, 4, 5), solution.strange_sort_list(Arrays.asList(1,2,3,4,5,6,7,8)));
        assertEquals(Arrays.asList(-5, 5, -5, 5, 0, 2, 2, 2), solution.strange_sort_list(Arrays.asList(0,2,2,2,5,5,-5,-5)));
        assertEquals(Arrays.asList(111111), solution.strange_sort_list(Arrays.asList(111111)));
    }
}
