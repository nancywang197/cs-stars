import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_19Test {

    HumanEval_19 sorter = new HumanEval_19();

    @Test
    public void testEmpty() {
        assertEquals("", sorter.sort_numbers(""));
    }

    @Test
    public void testSingleNumber() {
        assertEquals("three", sorter.sort_numbers("three"));
    }

    @Test
    public void testAlreadySorted() {
        assertEquals("three five nine", sorter.sort_numbers("three five nine"));
    }

    @Test
    public void testUnsorted() {
        assertEquals("zero four five seven eight nine", sorter.sort_numbers("five zero four seven nine eight"));
    }

    @Test
    public void testReverseSorted() {
        assertEquals("zero one two three four five six", sorter.sort_numbers("six five four three two one zero"));
    }
}
