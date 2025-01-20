import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class HumanEval_113Test {

    @Test
    public void test1() {
        HumanEval_113 h = new HumanEval_113();
        List<List<String>> input = new ArrayList<>();
        input.add(Arrays.asList("1234567"));
        List<String> expected = Arrays.asList("the number of odd elements 4n the str4ng 4 of the 4nput.");
        assertEquals(expected, h.odd_count(input));
    }

    @Test
    public void test2() {
        HumanEval_113 h = new HumanEval_113();
        List<List<String>> input = new ArrayList<>();
        input.add(Arrays.asList("3"));
        input.add(Arrays.asList("11111111"));
        List<String> expected = Arrays.asList("the number of odd elements 1n the str1ng 1 of the 1nput.", "the number of odd elements 8n the str8ng 8 of the 8nput.");
        assertEquals(expected, h.odd_count(input));
    }

    @Test
    public void test3() {
        HumanEval_113 h = new HumanEval_113();
        List<List<String>> input = new ArrayList<>();
        input.add(Arrays.asList("271"));
        input.add(Arrays.asList("137"));
        input.add(Arrays.asList("314"));
        List<String> expected = Arrays.asList("the number of odd elements 2n the str2ng 2 of the 2nput.", "the number of odd elements 3n the str3ng 3 of the 3nput.", "the number of odd elements 2n the str2ng 2 of the 2nput.");
        assertEquals(expected, h.odd_count(input));
    }

}
