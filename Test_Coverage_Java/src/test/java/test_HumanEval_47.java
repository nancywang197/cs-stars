import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval47Test {

    @Test
    public void testHumanEval47_MedianOfPositiveNumbers() {
        double[] numbers = {3, 1, 2, 4, 5};
        assertEquals(3, median(numbers));
    }

    @Test
    public void testHumanEval47_MedianOfNegativeAndPositiveNumbers() {
        double[] numbers = {-10, 4, 6, 1000, 10, 20};
        assertEquals(8.0, median(numbers), 1e-2); // Allowing for a small margin of error due to floating point precision
    }

    @Test
    public void testHumanEval47_MedianOfSingleElementArray() {
        double[] numbers = {5};
        assertEquals(5, median(numbers));
    }

    @Test
    public void testHumanEval47_MedianOfTwoElementsArray() {
        double[] numbers = {6, 5};
        assertEquals(5.5, median(numbers), 1e-2); // Allowing for a small margin of error due to floating point precision
    }

    @Test
    public void testHumanEval47_MedianOfMultipleElementsArray() {
        double[] numbers = {8, 1, 3, 9, 9, 2, 7};
        assertEquals(7.0, median(numbers), 1e-2); // Allowing for a small margin of error due to floating point precision
    }
}