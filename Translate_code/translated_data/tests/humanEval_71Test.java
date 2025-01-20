import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_71Test {

    HumanEval_71 tester = new HumanEval_71();

    @Test
    public void testTriangleArea() {
        assertEquals(6.00, tester.triangle_area(3, 4, 5), 0.001);
        assertEquals(-1, tester.triangle_area(1, 2, 10), 0.001);
        assertEquals(8.18, tester.triangle_area(4, 8, 5), 0.001);
        assertEquals(1.73, tester.triangle_area(2, 2, 2), 0.001);
        assertEquals(-1, tester.triangle_area(1, 2, 3), 0.001);
        assertEquals(16.25, tester.triangle_area(10, 5, 7), 0.001);
        assertEquals(-1, tester.triangle_area(2, 6, 3), 0.001);
        assertEquals(0.43, tester.triangle_area(1, 1, 1), 0.001);
        assertEquals(-1, tester.triangle_area(2, 2, 10), 0.001);
    }
}
