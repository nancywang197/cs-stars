import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class HumanEval_87Test {

    @Test
    public void testGetRow1() {
        HumanEval_87 test = new HumanEval_87();
        List<List<Integer>> lst1 = new ArrayList<>();
        lst1.add(Arrays.asList(1, 2, 3, 4, 5, 6));
        lst1.add(Arrays.asList(1, 2, 3, 4, 1, 6));
        lst1.add(Arrays.asList(1, 2, 3, 4, 5, 1));
        List<int[]> expected1 = Arrays.asList(new int[]{0, 0}, new int[]{1, 4}, new int[]{1, 0}, new int[]{2, 5}, new int[]{2, 0});
        assertEquals(expected1, test.get_row(lst1, 1));
    }

    @Test
    public void testGetRow2() {
        HumanEval_87 test = new HumanEval_87();
        List<List<Integer>> lst2 = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            lst2.add(Arrays.asList(1, 2, 3, 4, 5, 6));
        }
        List<int[]> expected2 = Arrays.asList(new int[]{0, 1}, new int[]{1, 1}, new int[]{2, 1}, new int[]{3, 1}, new int[]{4, 1}, new int[]{5, 1});
        assertEquals(expected2, test.get_row(lst2, 2));
    }

    @Test
    public void testGetRow3() {
        HumanEval_87 test = new HumanEval_87();
        List<List<Integer>> lst3 = new ArrayList<>();
        lst3.add(Arrays.asList(1, 2, 3, 4, 5, 6));
        lst3.add(Arrays.asList(1, 2, 3, 4, 5, 6));
        lst3.add(Arrays.asList(1, 1, 3, 4, 5, 6));
        lst3.add(Arrays.asList(1, 2, 1, 4, 5, 6));
        lst3.add(Arrays.asList(1, 2, 3, 1, 5, 6));
        lst3.add(Arrays.asList(1, 2, 3, 4, 1, 6));
        lst3.add(Arrays.asList(1, 2, 3, 4, 5, 1));
        List<int[]> expected3 = Arrays.asList(new int[]{0, 0}, new int[]{1, 0}, new int[]{2, 1}, new int[]{2, 0}, new int[]{3, 2}, new int[]{3, 0}, new int[]{4, 3}, new int[]{4, 0}, new int[]{5, 4}, new int[]{5, 0}, new int[]{6, 5}, new int[]{6, 0});
        assertEquals(expected3, test.get_row(lst3, 1));
    }

    @Test
    public void testGetRow4() {
        HumanEval_87 test = new HumanEval_87();
        List<List<Integer>> lst4 = new ArrayList<>();
        List<int[]> expected4 = new ArrayList<>();
        assertEquals(expected4, test.get_row(lst4, 1));
    }

    @Test
    public void testGetRow5() {
        HumanEval_87 test = new HumanEval_87();
        List<List<Integer>> lst5 = new ArrayList<>();
        lst5.add(Arrays.asList(1));
        List<int[]> expected5 = new ArrayList<>();
        assertEquals(expected5, test.get_row(lst5, 2));
    }

    @Test
    public void testGetRow6() {
        HumanEval_87 test = new HumanEval_87();
        List<List<Integer>> lst6 = new ArrayList<>();
        lst6.add(new ArrayList<>());
        lst6.add(Arrays.asList(1));
        lst6.add(Arrays.asList(1, 2, 3));
        List<int[]> expected6 = Arrays.asList(new int[]{2, 2});
        assertEquals(expected6, test.get_row(lst6, 3));
    }
}
