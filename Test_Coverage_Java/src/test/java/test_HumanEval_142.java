import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval_142Test {

    @Test
    public void test_HumanEval_142_SimpleCases() {
        // Check some simple cases

        assertEquals(6, sum_squares(new int[] {1,2,3}));
        assertEquals(14, sum_squares(new int[] {1,4,9}));
        assertEquals(0, sum_squares(new int[] {}));
        assertEquals(9, sum_squares(new int[] {1,1,1,1,1,1,1,1,1}));
        assertEquals(-3, sum_squares(new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1}));

        assertEquals(0, sum_squares(new int[] {0}));
        assertEquals(-126, sum_squares(new int[] {-1,-5,2,-1,-5}));
        assertEquals(3030, sum_squares(new int[] {-56,-99,1,0,-2}));
        assertEquals(0, sum_squares(new int[] {-1,0,0,0,0,0,0,0,-1}));

        assertEquals(-14196, sum_squares(new int[] {-16, -9, -2, 36, 36, 26, -20, 25, -40, 20, -4, 12, -26, 35, 37}));
        assertEquals(-1448, sum_squares(new int[] {-1, -3, 17, -1, -15, 13, -1, 14, -14, -12, -5, 14, -14, 6, 13, 11, 16, 16, 4, 10}));
    }
}