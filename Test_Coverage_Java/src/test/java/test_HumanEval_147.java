import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEvalTest {

    @Test
    public void test_HumanEval_147() {
        int maxTriples = HumanEval_147.getMaxTriples(5);
        assertEquals(1, maxTriples);

        maxTriples = HumanEval_147.getMAXTRIPLES(6);
        assertEquals(4, maxTriples);

        maxTriples = HumanEval_147.getMAXTRIPLES(10);
        assertEquals(36, maxTriples);

        maxTriples = HumanEval_147.getMAXTRIPLES(100);
        assertEquals(53361, maxTriples);
    }
}