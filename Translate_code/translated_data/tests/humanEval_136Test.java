import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_136Test {

    @Test
    public void testLargestSmallestIntegers() {
        HumanEval_136 tester = new HumanEval_136();
        assertArrayEquals(new int[] {-1,1}, tester.largest_smallest_integers(new int[]{2, 4, 1, 3, 5, 7}));
        assertArrayEquals(new int[] {-1,1}, tester.largest_smallest_integers(new int[]{2, 4, 1, 3, 5, 7, 0}));
        assertArrayEquals(new int[] {-2,1}, tester.largest_smallest_integers(new int[]{1, 3, 2, 4, 5, 6, -2}));
        assertArrayEquals(new int[] {-7,2}, tester.largest_smallest_integers(new int[]{4, 5, 3, 6, 2, 7, -7}));
        assertArrayEquals(new int[] {-9,2}, tester.largest_smallest_integers(new int[]{7, 3, 8, 4, 9, 2, 5, -9}));
        assertArrayEquals(new int[] {}, tester.largest_smallest_integers(new int[]{}));
        assertArrayEquals(new int[] {}, tester.largest_smallest_integers(new int[]{0}));
        assertArrayEquals(new int[] {-1}, tester.largest_smallest_integers(new int[]{-1, -3, -5, -6}));
        assertArrayEquals(new int[] {-1}, tester.largest_smallest_integers(new int[]{-1, -3, -5, -6, 0}));
        assertArrayEquals(new int[] {-3, 1}, tester.largest_smallest_integers(new int[]{-6, -4, -4, -3, 1}));
        assertArrayEquals(new int[] {-3, 1}, tester.largest_smallest_integers(new int[]{-6, -4, -4, -3, -100, 1}));

    }
}
