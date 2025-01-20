import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class HumanEval_29Test {
    @Test
    public void testFilterByPrefixEmpty() {
        HumanEval_29 filter = new HumanEval_29();
        assertEquals(filter.filterByPrefix(Arrays.asList(), "john"), Arrays.asList());
    }

    @Test
    public void testFilterByPrefixNotEmpty() {
        HumanEval_29 filter = new HumanEval_29();
        List<String> input = Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx");
        List<String> expected = Arrays.asList("xxx", "xxxAAA", "xxx");
        assertEquals(filter.filterByPrefix(input, "xxx"), expected);
    }
}
