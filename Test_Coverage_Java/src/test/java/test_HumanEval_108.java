import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval108Test {

    @Test
    public void testCountNums_EmptyList_ReturnsZero() {
        assertEquals(0, countNums(new int[]{}));
    }

    @Test
    public void testCountNums_SingleElementList_ReturnsOne() {
        assertTrue(countNums(new int[]{1}) == 1);
    }

    @Test
    public void testCountNums_ZeroesInList_ReturnsZero() {
        assertEquals(0, countNums(new int[]{-1, -2, 0}));
    }

    @Test
    public void testCountNums_SimplePositiveList_ReturnsCorrectLength() {
        assertEquals(6, countNums(new int[]{1, 1, 2, -2, 3, 4, 5}));
    }

    @Test
    public void testCountNums_MixOfPositiveAndNegativeNumbers_ReturnsCorrectLength() {
        assertEquals(5, countNums(new int[]{1, 6, 9, -6, 0, 1, 5}));
    }

    @Test
    public void testCountNums_OddNumberInList_ReturnsCorrectLength() {
        assertTrue(countNums(new int[]{1, 100, 98, -7, 1, -1}) == 4);
    }

    @Test
    public void testCountNums_MoreThanOnePositiveNumber_ReturnsCorrectLength() {
        assertEquals(5, countNums(new int[]{12, 23, 34, -45, -56, 0}));
    }

    @Test
    public void testCountNums_HalfZero_ReturnsOne() {
        assertEquals(1, countNums(new int[]{-0, 1**0}));
    }
}