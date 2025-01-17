import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_49Test {

    @Test
    public void test_HumanEval_49() {
        assertEquals(3, modp(3, 5));
        assertEquals(2, modp(1101, 101));
        assertEquals(1, modp(0, 101));
        assertEquals(8, modp(3, 11));
        assertEquals(1, modp(100, 101));
        assertEquals(4, modp(30, 5));
        assertEquals(3, modp(31, 5));
    }
}