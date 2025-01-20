import org.junit.Test;
import org.junit.Assert;
import java.util.Arrays;
import java.util.List;

public class HumanEval_123Test {

    @Test
    public void test_HumanEval_123() {
        HumanEval_123 instance = new HumanEval_123();
        Assert.assertEquals(Arrays.asList(1, 5, 7, 11, 13, 17), instance.get_odd_collatz(14));
        Assert.assertEquals(Arrays.asList(1, 5), instance.get_odd_collatz(5));
        Assert.assertEquals(Arrays.asList(1, 3, 5), instance.get_odd_collatz(12));
        Assert.assertEquals(Arrays.asList(1), instance.get_odd_collatz(1));
    }
}
