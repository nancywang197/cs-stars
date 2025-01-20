import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_80Test {

    HumanEval_80 happy = new HumanEval_80();

    @Test
    public void testIsHappy() {
        assertEquals(false, happy.isHappy("a"));
        assertEquals(false, happy.isHappy("aa"));
        assertEquals(true, happy.isHappy("abcd"));
        assertEquals(false, happy.isHappy("aabb"));
        assertEquals(true, happy.isHappy("adb"));
        assertEquals(false, happy.isHappy("xyy"));
        assertEquals(true, happy.isHappy("iopaxpoi"));
        assertEquals(false, happy.isHappy("iopaxioi"));
    }
}
