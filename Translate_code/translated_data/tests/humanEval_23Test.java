import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_23Test {

    HumanEval_23 strlen = new HumanEval_23();

    @Test
    public void testStrlenEmpty() {
        assertEquals(0, strlen.strlen(""));
    }

    @Test
    public void testStrlenOneChar() {
        assertEquals(1, strlen.strlen("x"));
    }

    @Test
    public void testStrlenLongString() {
        assertEquals(9, strlen.strlen("asdasnakj"));
    }
}
