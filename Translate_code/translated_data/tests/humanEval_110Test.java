import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_110Test {

    @Test
    public void testExchange() {
        HumanEval_110 exchangeFunc = new HumanEval_110();
        assertEquals("YES", exchangeFunc.exchange(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}));
        assertEquals("NO", exchangeFunc.exchange(new int[]{1, 2, 3, 4}, new int[]{1, 5, 3, 4}));
        assertEquals("YES", exchangeFunc.exchange(new int[]{1, 2, 3, 4}, new int[]{2, 1, 4, 3}));
        assertEquals("YES", exchangeFunc.exchange(new int[]{5, 7, 3}, new int[]{2, 6, 4}));
        assertEquals("NO", exchangeFunc.exchange(new int[]{5, 7, 3}, new int[]{2, 6, 3}));
        assertEquals("NO", exchangeFunc.exchange(new int[]{3, 2, 6, 1, 8, 9}, new int[]{3, 5, 5, 1, 1, 1}));
        assertEquals("YES", exchangeFunc.exchange(new int[]{100, 200}, new int[]{200, 200}));
    }
}
