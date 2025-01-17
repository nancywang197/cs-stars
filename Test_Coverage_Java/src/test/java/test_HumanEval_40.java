import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_40Test {

    @Test
    public void test_HumanEval_40_withSmallTriplets() {
        boolean result1 = HumanEval_40.triplesSumToZero(new int[]{1, 3, 5, 0});
        boolean result2 = HumanEval_40.triplesSumToZero(new int[]{1, 3, 5, -1});
        assertEquals(false, result1);
        assertEquals(false, result2);
    }

    @Test
    public void test_HumanEval_40_withPositiveTriplets() {
        boolean result1 = HumanEval_40.triplesSumToZero(new int[]{1, 3, -2, 1});
        assertEquals(true, result1);
    }

    @Test
    public void test_HumanEval_40_withLargeNumbers() {
        boolean result1 = HumanEval_40.triplesSumToZero(new int[]{1, 2, 3, 7});
        boolean result2 = HumanEval_40.triplesSumToZero(new int[]{1, 2, 5, 7});
        assertEquals(false, result1);
        assertEquals(false, result2);
    }

    @Test
    public void test_HumanEval_40_withEvenNumberTriplets() {
        boolean result = HumanEval_40.triplesSumToZero(new int[]{2, 4, -5, 3, 9, 7});
        assertEquals(true, result);
    }

    @Test
    public void test_HumanEval_40_withSingleElementList() {
        boolean result = HumanEval_40.triplesSumToZero(new int[]{1});
        assertEquals(false, result);
    }

    @Test
    public void test_HumanEval_40_withLargeNumberTriplets() {
        boolean result1 = HumanEval_40.triplesSumToZero(new int[]{100, 3, 5, -100});
        boolean result2 = HumanEval_40.triplesSumToZero(new int[]{1, 3, 5, -100});
        assertEquals(false, result1);
        assertEquals(false, result2);
    }
}