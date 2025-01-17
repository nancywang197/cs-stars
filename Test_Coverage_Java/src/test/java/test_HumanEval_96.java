import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class HumanEval96Test {

    @Test
    public void test_HumanEval_96() {
        assertArrayEquals(new int[] {2,3}, HumanEval96.countUpTo(5));
        assertArrayEquals(new int[] {2,3,5}, HumanEval96.countUpTo(6));
        assertArrayEquals(new int[] {2,3,5}, HumanEval96.countUpTo(7));
        assertArrayEquals(new int[] {2,3,5,7}, HumanEval96.countUpTo(10));
        assertArrayEquals(new int[0], HumanEval96.countUpTo(0));
        assertArrayEquals(new int[] {2,3,5,7,11,13,17,19}, HumanEval96.countUpTo(22));
        assertArrayEquals(new int[0], HumanEval96.countUpTo(1));
        assertArrayEquals(new int[] {2,3,5,7,11,13,17}, HumanEval96.countUpTo(18));
        assertArrayEquals(new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43}, HumanEval96.countUpTo(47));
        assertArrayEquals(new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97}, HumanEval96.countUpTo(101));
    }
}