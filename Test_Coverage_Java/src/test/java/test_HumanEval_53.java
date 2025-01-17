import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval53Test {

    @Test
    public void testAddZero() {
        int result = add(0, 1);
        assertEquals(1, result);
    }

    @Test
    public void testAddOneToZero() {
        int result = add(1, 0);
        assertEquals(1, result);
    }

    @Test
    public void testAddPositiveNumbers() {
        int result = add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testAddLargePositiveNumbers() {
        int result = add(5, 7);
        assertEquals(12, result);
    }

    @Test
    public void testAddEqualPositiveNumbers() {
        int result = add(7, 5);
        assertEquals(12, result);
    }

    @Test
    public void testRandomNumberAddition() {
        for (int i = 0; i < 100; i++) {
            int x = (int) Math.random() * 1001;
            int y = (int) Math.random() * 1001;
            int result = add(x, y);
            assertEquals(x + y, result);
        }
    }

}