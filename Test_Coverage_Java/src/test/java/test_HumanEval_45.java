import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_45Test {

    @Test
    public void test_HumanEval_45() {
        assertEquals(7.5, HumanEval_45.triangle_area(5, 3), 0.01);
        assertEquals(2.0, HumanEval_45.triangle_area(2, 2), 0.01);
        assertEquals(40.0, HumanEval_45.triangle_area(10, 8), 0.01);
    }
}