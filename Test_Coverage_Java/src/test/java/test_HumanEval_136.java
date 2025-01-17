import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval_136Test {

    @Test
    public void test_HumanEval_136_SimpleCases() {
        int[] nums = {2, 4, 1, 3, 5, 7};
        Pair result = largestSmallestIntegers(nums);
        assertEquals(null, result.getSmallest());
        assertEquals(1, result.getLargest());
    }

    @Test
    public void test_HumanEval_136_SimpleCasesWithZero() {
        int[] nums = {2, 4, 1, 3, 5, 7, 0};
        Pair result = largestSmallestIntegers(nums);
        assertEquals(null, result.getSmallest());
        assertEquals(1, result.getLargest());
    }

    @Test
    public void test_HumanEval_136_SimpleCasesWithNegativeNumbers() {
        int[] nums = {1, 3, 2, 4, 5, 6, -2};
        Pair result = largestSmallestIntegers(nums);
        assertEquals(-2, result.getSmallest());
        assertEquals(1, result.getLargest());
    }

    @Test
    public void test_HumanEval_136_SimpleCasesWithMultipleNegatives() {
        int[] nums = {4, 5, 3, 6, 2, 7, -7};
        Pair result = largestSmallestIntegers(nums);
        assertEquals(-7, result.getSmallest());
        assertEquals(2, result.getLargest());
    }

    @Test
    public void test_HumanEval_136_SimpleCasesWithMultipleNegativesAndPositive() {
        int[] nums = {7, 3, 8, 4, 9, 2, 5, -9};
        Pair result = largestSmallestIntegers(nums);
        assertEquals(-9, result.getSmallest());
        assertEquals(2, result.getLargest());
    }

    @Test
    public void test_HumanEval_136_EmptyArray() {
        int[] nums = {};
        Pair result = largestSmallestIntegers(nums);
        assertEquals(null, result.getSmallest());
        assertEquals(null, result.getLargest());
    }

    @Test
    public void test_HumanEval_136_SingleElementArrayWithZero() {
        int[] nums = {0};
        Pair result = largestSmallestIntegers(nums);
        assertEquals(null, result.getSmallest());
        assertEquals(null, result.getLargest());
    }

    @Test
    public void test_HumanEval_136_SimpleCasesNegativeNumbersAndPositive() {
        int[] nums = {-1, -3, -5, -6};
        Pair result = largestSmallestIntegers(nums);
        assertEquals(-1, result.getSmallest());
        assertEquals(null, result.getLargest());
    }

    @Test
    public void test_HumanEval_136_SimpleCasesNegativeNumbersAndPositiveWithZero() {
        int[] nums = {-1, -3, -5, -6, 0};
        Pair result = largestSmallestIntegers(nums);
        assertEquals(-1, result.getSmallest());
        assertEquals(null, result.getLargest());
    }

    @Test
    public void test_HumanEval_136_SimpleCasesMultipleNegativesAndPositive() {
        int[] nums = {-6, -4, -4, -3, 1};
        Pair result = largestSmallestIntegers(nums);
        assertEquals(-3, result.getSmallest());
        assertEquals(1, result.getLargest());
    }

    @Test
    public void test_HumanEval_136_SimpleCasesMultipleNegativesAndPositiveWithNegative100() {
        int[] nums = {-6, -4, -4, -3, -100, 1};
        Pair result = largestSmallestIntegers(nums);
        assertEquals(-3, result.getSmallest());
        assertEquals(1, result.getLargest());
    }

    @Test
    public void test_HumanEval_136_EmptyArray() {
        int[] nums = {};
        Pair result = largestSmallestIntegers(nums);
        assertEquals(null, result.getSmallest());
        assertEquals(null, result.getLargest());
    }
}