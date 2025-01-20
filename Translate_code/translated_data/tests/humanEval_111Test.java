import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.assertEquals;

public class HumanEval_111Test {

    @Test
    public void testHistogram() {
        HumanEval_111 instance = new HumanEval_111();
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        assertEquals(expected, instance.histogram("a b b a"));

        expected.clear();
        expected.put("a", 2);
        expected.put("b", 2);
        assertEquals(expected, instance.histogram("a b c a b"));

        expected.clear();
        expected.put("a", 1);
        expected.put("b", 1);
        expected.put("c", 1);
        expected.put("d", 1);
        expected.put("g", 1);
        assertEquals(expected, instance.histogram("a b c d g"));

        expected.clear();
        expected.put("r", 1);
        expected.put("t", 1);
        expected.put("g", 1);
        assertEquals(expected, instance.histogram("r t g"));

        expected.clear();
        expected.put("b", 4);
        assertEquals(expected, instance.histogram("b b b b a"));

        expected.clear();
        expected.put("r", 1);
        expected.put("t", 1);
        expected.put("g", 1);
        assertEquals(expected, instance.histogram("r t g"));

        assertEquals(new HashMap<>(), instance.histogram(""));

        expected.clear();
        expected.put("a", 1);
        assertEquals(expected, instance.histogram("a"));
    }
}
