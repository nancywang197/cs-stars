import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_133Test {

    @Test
    public void testSumSquares() {
        HumanEval_133 calculator = new HumanEval_133();
        assertEquals(14, calculator.sum_squares(new int[] {1, 2, 3}));
        assertEquals(14, calculator.sum_squares(new int[] {1, 2, 3}));
        assertEquals(84, calculator.sum_squares(new int[] {1, 3, 5, 7}));
        assertEquals(29, calculator.sum_squares(new int[] {1, 5, 0}));
        assertEquals(6, calculator.sum_squares(new int[] {-2, 1, 1}));

        assertEquals(10230, calculator.sum_squares(new int[] {100, 1, 15, 2}));
        assertEquals(200000000, calculator.sum_squares(new int[] {10000, 10000}));
        assertEquals(75, calculator.sum_squares(new int[] {-1, 5, 7}));
        assertEquals(1086, calculator.sum_squares(new int[] {-1, 18, 19, 20}));

        assertEquals(0, calculator.sum_squares(new int[] {0}));
        assertEquals(1, calculator.sum_squares(new int[] {-1}));
        assertEquals(2, calculator.sum_squares(new int[] {-1, 1, 0}));
    }
}
