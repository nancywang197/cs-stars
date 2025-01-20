import org.junit.Test;
import java.util.List;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class HumanEval_28Test {

    @Test
    public void testConcatenateEmpty() {
        HumanEval_28 humanEval_28 = new HumanEval_28();
        assertEquals("", humanEval_28.concatenate(Arrays.asList()));
    }

    @Test
    public void testConcatenateXYZ() {
        HumanEval_28 humanEval_28 = new HumanEval_28();
        assertEquals("xyz", humanEval_28.concatenate(Arrays.asList("x", "y", "z")));
    }

    @Test
    public void testConcatenateXYZWK() {
        HumanEval_28 humanEval_28 = new HumanEval_28();
        assertEquals("xyzwk", humanEval_28.concatenate(Arrays.asList("x", "y", "z", "w", "k")));
    }
}
