import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertArrayEquals;

public class HumanEval_33Test {

    @Test
    public void testSortThird1() {
        HumanEval_33 solver = new HumanEval_33();
        List<Integer> input = Arrays.asList(1, 2, 3);
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertArrayEquals(expected.toArray(), solver.sort_third(input).toArray());
    }

    @Test
    public void testSortThird2() {
        HumanEval_33 solver = new HumanEval_33();
        List<Integer> input = Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
        List<Integer> expected = Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
        assertArrayEquals(expected.toArray(), solver.sort_third(input).toArray());
    }

    @Test
    public void testSortThird3() {
        HumanEval_33 solver = new HumanEval_33();
        List<Integer> input = Arrays.asList(5, 8, -12, 4, 23, 2, 3, 11, 12, -10);
        List<Integer> expected = Arrays.asList(5, 8, -12, 4, 23, 2, 3, 11, 12, -10);
        assertArrayEquals(expected.toArray(), solver.sort_third(input).toArray());
    }

    @Test
    public void testSortThird4() {
        HumanEval_33 solver = new HumanEval_33();
        List<Integer> input = Arrays.asList(5, 6, 3, 4, 8, 9, 2);
        List<Integer> expected = Arrays.asList(2, 6, 3, 4, 8, 9, 5);
        assertArrayEquals(expected.toArray(), solver.sort_third(input).toArray());
    }

    @Test
    public void testSortThird5() {
        HumanEval_33 solver = new HumanEval_33();
        List<Integer> input = Arrays.asList(5, 8, 3, 4, 6, 9, 2);
        List<Integer> expected = Arrays.asList(2, 8, 3, 4, 6, 9, 5);
        assertArrayEquals(expected.toArray(), solver.sort_third(input).toArray());
    }

    @Test
    public void testSortThird6() {
        HumanEval_33 solver = new HumanEval_33();
        List<Integer> input = Arrays.asList(5, 6, 9, 4, 8, 3, 2);
        List<Integer> expected = Arrays.asList(2, 6, 9, 4, 8, 3, 5);
        assertArrayEquals(expected.toArray(), solver.sort_third(input).toArray());
    }

    @Test
    public void testSortThird7() {
        HumanEval_33 solver = new HumanEval_33();
        List<Integer> input = Arrays.asList(5, 6, 3, 4, 8, 9, 2, 1);
        List<Integer> expected = Arrays.asList(2, 6, 3, 4, 8, 9, 5, 1);
        assertArrayEquals(expected.toArray(), solver.sort_third(input).toArray());
    }
}
