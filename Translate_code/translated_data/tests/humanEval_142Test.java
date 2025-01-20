import org.junit.Test;
import org.junit.Assert;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class HumanEval_142Test {

    @Test
    public void testSumSquares() {
        HumanEval_142 instance = new HumanEval_142();

        // Check some simple cases
        Assert.assertEquals(6, instance.sum_squares(Arrays.asList(1, 2, 3)));
        Assert.assertEquals(14, instance.sum_squares(Arrays.asList(1, 4, 9)));
        Assert.assertEquals(0, instance.sum_squares(new ArrayList<>()));
        Assert.assertEquals(9, instance.sum_squares(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1)));
        Assert.assertEquals(-3, instance.sum_squares(Arrays.asList(-1, -1, -1, -1, -1, -1, -1, -1, -1)));
        Assert.assertEquals(0, instance.sum_squares(Arrays.asList(0)));
        Assert.assertEquals(-126, instance.sum_squares(Arrays.asList(-1, -5, 2, -1, -5)));
        Assert.assertEquals(3030, instance.sum_squares(Arrays.asList(-56, -99, 1, 0, -2)));
        Assert.assertEquals(0, instance.sum_squares(Arrays.asList(-1, 0, 0, 0, 0, 0, 0, 0, -1)));
        Assert.assertEquals(-14196, instance.sum_squares(Arrays.asList(-16, -9, -2, 36, 36, 26, -20, 25, -40, 20, -4, 12, -26, 35, 37)));
        Assert.assertEquals(-1448, instance.sum_squares(Arrays.asList(-1, -3, 17, -1, -15, 13, -1, 14, -14, -12, -5, 14, -14, 6, 13, 11, 16, 16, 4, 10)));
    }
}
