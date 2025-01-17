import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_23Test {

    @Test
    public void test_HumanEval_23() {
        int length = functions.HumanEval_23strlen(" ");
        assertEquals(0, length);

        length = functions.HumanEval_23strlen("x");
        assertEquals(1, length);

        length = functions.HumanEval_23strlen("asdasnakj");
        assertEquals(9, length);
    }
}