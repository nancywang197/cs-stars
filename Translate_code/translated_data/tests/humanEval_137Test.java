import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_137Test {

    HumanEval_137 compareOne = new HumanEval_137();

    @Test
    public void testCompareOne() {
        assertEquals(2, compareOne.compare_one(1, 2));
        assertEquals(2.5, compareOne.compare_one(1, 2.5));
        assertEquals(3, compareOne.compare_one(2, 3));
        assertEquals(6, compareOne.compare_one(5, 6));
        assertEquals("2,3", compareOne.compare_one(1, "2,3"));
        assertEquals("6", compareOne.compare_one("5,1", "6"));
        assertEquals("2", compareOne.compare_one("1", "2"));
        assertNull(compareOne.compare_one("1", 1));
    }

    @Test
    public void testTrue(){
        assertTrue(true);
    }
}
