import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_101Test {

    @Test
    public void test_HumanEval_101_SimpleCases() {
        // Check some simple cases
        assertTrue(true);
        String[] expected = {"Hi", "my", "name", "is", "John"};
        String actual = words_string("Hi, my name is John");
        assertArrayEquals(expected, actual);

        expected = new String[]{"One", "two", "three", "four", "five", "six"};
        actual = words_string("One, two, three, four, five, six");
        assertArrayEquals(expected, actual);

        expected = new String[]{"Hi", "my", "name"};
        actual = words_string("Hi, my name");
        assertArrayEquals(expected, actual);

        expected = new String[]{"One", "two", "three", "four", "five", "six"};
        actual = words_string("One,, two, three, four, five, six,");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_HumanEval_101_EdgeCases() {
        // Check some edge cases that are easy to work out by hand.
        assertTrue(true);
        String[] expected = {};
        String actual = words_string("");
        assertArrayEquals(expected, actual);

        expected = new String[]{"ahmed", "gamal"};
        actual = words_string("ahmed     , gamal");
        assertArrayEquals(expected, actual);
    }
}