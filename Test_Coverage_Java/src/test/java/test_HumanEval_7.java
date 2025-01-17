import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HumanEval7Test {

    @Test
    public void test_EmptyList() {
        assertArrayEquals(filterBySubstring(new String[0], "john"), new String[0]);
    }

    @Test
    public void test_SingleSubstringMatch() {
        String[] result = filterBySubstring(new String[] {"xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx"}, "xxx");
        assertEquals(3, countElements(result));
    }

    @Test
    public void test_MultipleSubstringMatches() {
        String[] result = filterBySubstring(new String[] {"xxx", "asd", "aaaxxy", "john doe", "xxxAAA", "xxx"}, "xx");
        assertEquals(4, countElements(result));
    }

    @Test
    public void test_NoMatch() {
        String[] result = filterBySubstring(new String[] {"grunt", "trumpet", "prune", "gruesome"}, "run");
        assertEquals(2, countElements(result));
    }
}

private int countElements(String[] array) {
    return array.length;
}

public String[] filterBySubstring(String[] inputArray, String substring) {
    StringBuilder sb = new StringBuilder();
    for (String str : inputArray) {
        if (str.contains(substring)) {
            sb.append(str).append(",");
        }
    }
    return sb.toString().split(",").map(s -> s.trim()).toArray(String[]::new);
}