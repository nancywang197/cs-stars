import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval8Test {

    @Test
    public void testHumanEval_8_EmptyList() {
        Object[] result = sumProduct(new int[]{});
        assertEquals(0, (int)result[0]);
        assertEquals(1, (int)result[1]);
    }

    @Test
    public void testHumanEval_8_SingleElementList() {
        Object[] result = sumProduct(new int[]{10});
        assertEquals(10, (int)result[0]);
        assertEquals(10, (int)result[1]);
    }

    @Test
    public void testHumanEval_8_SameElementsList() {
        Object[] result = sumProduct(new int[]{1, 1, 1});
        assertEquals(3, (int)result[0]);
        assertEquals(1, (int)result[1]);
    }

    @Test
    public void testHumanEval_8_DifferentNumbersList() {
        Object[] result = sumProduct(new int[]{10, 5, 7});
        assertEquals(22, (int)result[0]);
        assertEquals(175, (int)result[1]);
    }

    @Test
    public void testHumanEval_8_ZeroElementList() {
        Object[] result = sumProduct(new int[]{100, 0});
        assertEquals(100, (int)result[0]);
        assertEquals(0, (int)result[1]);
    }
}