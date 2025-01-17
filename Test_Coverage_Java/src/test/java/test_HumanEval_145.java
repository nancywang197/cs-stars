import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval {

    @Test
    public void test_HumanEval_145() {
        int[] result = order_by_points(new int[]{1, 11, -1, -11, -12});
        assertArrayEquals(new int[]{-1, -11, 1, -12, 11}, result);

        result = order_by_points(new int[]{1234,423,463,145,2,423,423,53,6,37,3457,3,56,0,46});
        assertArrayEquals(new int[]{0, 2, 3, 6, 53, 423, 423, 423, 1234, 145, 37, 46, 56, 463, 3457}, result);

        result = order_by_points(new int[]{}); // empty array
        assertArrayEquals(new int[]{}, result);

        result = order_by_points(new int[]{1, -11, -32, 43, 54, -98, 2, -3});
        assertArrayEquals(new int[]{-3, -32, -98, -11, 1, 2, 43, 54}, result);

        result = order_by_points(new int[]{1,2,3,4,5,6,7,8,9,10,11}); // ascending order of consecutive numbers
        assertArrayEquals(new int[]{1, 10, 2, 11, 3, 4, 5, 6, 7, 8, 9}, result);

        result = order_by_points(new int[]{0,6,6,-76,-21,23,4}); // mixed numbers
        assertArrayEquals(new int[]{-76, -21, 0, 4, 23, 6, 6}, result);
    }

    // Your function should be declared here and imported accordingly.
}