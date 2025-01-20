import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_127Test {

    HumanEval_127 h = new HumanEval_127();

    @Test
    public void testIntersection() {
        assertEquals("NO", h.intersection(new int[]{1, 2}, new int[]{2, 3}));
        assertEquals("NO", h.intersection(new int[]{-1, 1}, new int[]{0, 4}));
        assertEquals("YES", h.intersection(new int[]{-3, -1}, new int[]{-5, 5}));
        assertEquals("YES", h.intersection(new int[]{-2, 2}, new int[]{-4, 0}));
        assertEquals("NO", h.intersection(new int[]{-11, 2}, new int[]{-1, -1}));
        assertEquals("NO", h.intersection(new int[]{1, 2}, new int[]{3, 5}));
        assertEquals("NO", h.intersection(new int[]{1, 2}, new int[]{1, 2}));
        assertEquals("NO", h.intersection(new int[]{-2, -2}, new int[]{-3, -2}));
    }
}
