import org.junit.Test;
import org.junit.Assert;
import java.util.Arrays;
import java.util.List;

public class HumanEval_9Test {

    @Test
    public void testEmptyList() {
        HumanEval_9 rollingMax = new HumanEval_9();
        List<Integer> input = new java.util.ArrayList<>();
        List<Integer> expected = new java.util.ArrayList<>();
        Assert.assertEquals(expected, rollingMax.rollingMax(input));
    }

    @Test
    public void testIncreasingList() {
        HumanEval_9 rollingMax = new HumanEval_9();
        List<Integer> input = Arrays.asList(1, 2, 3, 4);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        Assert.assertEquals(expected, rollingMax.rollingMax(input));
    }

    @Test
    public void testDecreasingList() {
        HumanEval_9 rollingMax = new HumanEval_9();
        List<Integer> input = Arrays.asList(4, 3, 2, 1);
        List<Integer> expected = Arrays.asList(4, 4, 4, 4);
        Assert.assertEquals(expected, rollingMax.rollingMax(input));
    }

    @Test
    public void testMixedList() {
        HumanEval_9 rollingMax = new HumanEval_9();
        List<Integer> input = Arrays.asList(3, 2, 3, 100, 3);
        List<Integer> expected = Arrays.asList(3, 3, 3, 100, 100);
        Assert.assertEquals(expected, rollingMax.rollingMax(input));
    }
}
