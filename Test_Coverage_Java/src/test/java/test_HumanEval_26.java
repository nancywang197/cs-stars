import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval26Test {

    @Test
    public void testRemoveDuplicates_EmptyList() {
        int[] input = {};
        int[] expected = {};
        assertEquals(expected, removeDuplicates(input));
    }

    @Test
    public void testRemoveDuplicates_SingleElementList() {
        int[] input = {1};
        int[] expected = {1};
        assertEquals(expected, removeDuplicates(input));
    }

    @Test
    public void testRemoveDuplicates_DuplicateElements() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, removeDuplicates(input));
    }

    @Test
    public void testRemoveDuplicates_MultipleDuplicates() {
        int[] input = {1, 2, 3, 2, 4, 3, 5};
        int[] expected = {1, 4, 5};
        assertArrayEquals(expected, removeDuplicates(input));
    }
}

// Function to be tested (Note: This is a simple implementation, you may want to use Java's built-in data structures and functions for this purpose)
public class HumanEval26 {
    public static int[] removeDuplicates(int[] input) {
        if (input == null || input.length == 0) return input;
        
        // Use Java 8 streams to filter out duplicates
        return Arrays.stream(input).distinct().toArray();
    }
}