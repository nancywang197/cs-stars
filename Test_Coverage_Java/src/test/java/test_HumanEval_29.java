import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class HumanEval_29Test {

    @Test
    public void test_HumanEval_29() {
        String[] prefix = filterByPrefix([], "john");
        assertArrayEquals(prefix, []);

        String[] result = filterByPrefix(new String[]{"xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx"}, "xxx");
        assertArrayEquals(result, new String[]{"xxx", "xxxAAA", "xxx"});
    }

    // Assuming this method is implemented in the HumanEval_29 class
    public static String[] filterByPrefix(String[] input, String prefix) {
        List<String> result = new ArrayList<>();
        for (String str : input) {
            if (str.startsWith(prefix)) {
                result.add(str);
            }
        }
        return result.toArray(new String[0]);
    }
}