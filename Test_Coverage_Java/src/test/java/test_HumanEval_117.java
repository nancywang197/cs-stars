import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class HumanEval_117Test {

    public String selectWords(String input, int length) {
        // This method should be implemented according to your logic
        // For simplicity, let's assume we're selecting the words of a given length
        return Arrays.stream(input.split("\\s+"))
                .filter(word -> word.length() == length)
                .map(String::toUpperCase)
                .collect(Collectors.joining());
    }

    @Test
    public void test_HumanEval_117_SimpleCases() {
        // Check some simple cases
        assertEquals(Arrays.asList("LITTLE"), selectWords("Mary had a little lamb", 4));
        assertEquals(Arrays.asList("MARY", "LAMB"), selectWords("Mary had a little lamb", 3));
        assertTrue(selectWords("simple white space", 2).isEmpty());
        assertEquals(Collections.singletonList("WORLD"), Arrays.asList(selectWords("Hello world", 4)));
        assertEquals(Arrays.asList("UNCLE"), selectWords("Uncle sam", 3));
    }

    @Test
    public void test_HumanEval_117_EdgeCases() {
        // Check some edge cases that are easy to work out by hand.
        assertTrue(selectWords("", 4).isEmpty());
        assertEquals(Arrays.asList("B", "C", "D", "F"), selectWords("a b c d e f", 1));
    }
}